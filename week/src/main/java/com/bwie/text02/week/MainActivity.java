package com.bwie.text02.week;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;

import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private List<GoodBean.DataBean> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

        MyLvTask lvTask = new MyLvTask();
        lvTask.execute("https://www.zhaoapi.cn/product/getCatagory");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int cid = data.get(i).getCid();
                Intent it = new Intent(MainActivity.this,Main2Activity.class);
                it.putExtra("cid",cid);
                startActivity(it);
            }
        });
    }
    class MyLvTask extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            try {
                //SSLSocketFactory.getSocketFactory().setHostnameVerifier(new AllowAllHostnameVerifier());
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");
                urlConnection.setConnectTimeout(5000);
                urlConnection.setReadTimeout(5000);
                Log.i("TAG","===========");
                int responseCode = urlConnection.getResponseCode();
                Log.i("TAG",responseCode+"===========");
                if(responseCode == 200){
                    InputStream inputStream = urlConnection.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
                    String str=null;
                    StringBuilder builder=new StringBuilder();
                    while ((str=reader.readLine())!=null){
                            builder.append(str);
                        }
                    String s = builder.toString();
                    return s;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if(s!=null){
                Gson gson = new Gson();
                GoodBean goodBean = gson.fromJson(s, GoodBean.class);
                data = goodBean.getData();
                MyLvAdapter adapter = new MyLvAdapter(MainActivity.this, data);
                lv.setAdapter(adapter);
            }
        }
    }
}
