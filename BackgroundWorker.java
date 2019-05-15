package com.example.sample;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String,Void,String> {
Context context;
AlertDialog alertDialog;
BackgroundWorker(Context ctx)
{
    context=ctx;
}
    @Override
    protected String doInBackground(String... params) {
        String type=params[0];
        String login_url;
        login_url = "http://192.168.66.2/login.php";
        if(type.equals("login"))
        {
            try {
                String user_name=params[1];
                String password=params[2];
                URL url=new URL(login_url);
                HttpURLConnection httpURLconnection=(HttpURLConnection)url.openConnection();
                httpURLconnection.setRequestMethod("POST");
                httpURLconnection.setDoOutput(true);
                httpURLconnection.setDoInput(true);
                OutputStream outputstream=httpURLconnection.getOutputStream();
                BufferedWriter bufferedwriter=new BufferedWriter(new OutputStreamWriter(outputstream,"UTF-8"));
                String post_data= URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedwriter.write(post_data);
                bufferedwriter.flush();
                bufferedwriter.close();
                outputstream.close();
                InputStream inputStream=httpURLconnection.getInputStream();
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!=null)
                {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLconnection.disconnect();
                return result;

                }
            catch (MalformedURLException e) {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }
    protected void onPreExecute()
    {
       alertDialog = new AlertDialog.Builder(context).create();
       alertDialog.setTitle("Login Status");
    }
    protected void onPostExecute(String result)
    {
        alertDialog.setMessage(result);
        alertDialog.show();
    }
    protected void onProgressUpdate(Void... values)
    {
        super.onProgressUpdate(values);
    }
}
