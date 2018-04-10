package com.bwie.text02.text02;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    @SuppressLint("HandlerLeak")
    private Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Joke joke = (Joke) msg.obj;

            List<Joke.NewslistBean> newslist = joke.getNewslist();
            MyAdapter adapter = new MyAdapter(MainActivity.this, newslist);
            lv.setAdapter(adapter);

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        new Thread(){
            @Override
            public void run() {
                getList();
            }
        }.start();
    }

    private void getList() {
        try {
            URL url = new URL("http://api.tianapi.com/vr");
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setReadTimeout(5000);
            urlConnection.setConnectTimeout(5000);

            urlConnection.setDoOutput(true);
            String params="key=05402e89a46d4a6d6770b3e836ba0ad5&num=10";
            urlConnection.getOutputStream().write(params.getBytes());
            int responseCode = urlConnection.getResponseCode();
            if(responseCode == 200){
                InputStream inputStream = urlConnection.getInputStream();
                String str = streamToString(inputStream);

                Gson gson = new Gson();
                Joke joke = gson.fromJson(str, Joke.class);

                Message msg = new Message();
                msg.obj = joke;
                h.sendMessage(msg);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private String streamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        try {
            while((str = bufferedReader.readLine())!=null){
                stringBuilder.append(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
