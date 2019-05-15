package com.example.sample;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

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

public class BackgroundTask extends AsyncTask<String,Void,String> {
    Context ctx;
    //AlertDialog alertDialog;
    BackgroundTask(Context ctx)
    { this.ctx=ctx;
    }
    @Override
    protected String doInBackground(String... params) {
        String method=params[0];
        String reg_url;
        reg_url = "http://10.0.2.2/register.php";
        if(method.equals("register"))
        {
            String user_name=params[1];
            String password=params[2];
            try {

                URL url=new URL(reg_url);
                HttpURLConnection httpURLconnection=(HttpURLConnection)url.openConnection();
                httpURLconnection.setRequestMethod("POST");
                httpURLconnection.setDoOutput(true);
                OutputStream outputstream=httpURLconnection.getOutputStream();
                BufferedWriter bufferedwriter=new BufferedWriter(new OutputStreamWriter(outputstream,"UTF-8"));
                String post_data= URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedwriter.write(post_data);
                bufferedwriter.flush();
                bufferedwriter.close();
                outputstream.close();
                InputStream inputStream=httpURLconnection.getInputStream();
                inputStream.close();
                return "Registration Successful";

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
        //alertDialog = new AlertDialog.Builder(context).create();
        //alertDialog.setTitle("Login Status");
    }
    protected void onPostExecute(String result)
    {
        //alertDialog.setMessage(result);
        //alertDialog.show();
        Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
    }
    protected void onProgressUpdate(Void... values)
    {
        super.onProgressUpdate(values);
    }
}


