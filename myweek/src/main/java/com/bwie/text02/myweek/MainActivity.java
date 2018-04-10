package com.bwie.text02.myweek;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView clien_lv,connection_lv;
    private RadioGroup radio;
    private List<TianBean.DataBean> list;
    private Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            List<TianBean.DataBean> list1 = (List<TianBean.DataBean>) msg.obj;

            Myadapter adapter = new Myadapter(MainActivity.this,list1);
            clien_lv.setAdapter(adapter);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clien_lv = findViewById(R.id.clien_lv);
        connection_lv = findViewById(R.id.connection_lv);
        radio = findViewById(R.id.radiogroup);

        new Thread(){
            @Override
            public void run() {
                getCline_lv();
            }
        }.start();

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.httpclient_btn:
                        clien_lv.setVisibility(View.VISIBLE);
                        connection_lv.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.httpurlconnection_btn:
                        clien_lv.setVisibility(View.INVISIBLE);
                        connection_lv.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }

    public void getCline_lv() {
        SSLSocketFactory.getSocketFactory().setHostnameVerifier(new AllowAllHostnameVerifier());
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://www.toutiao.com/stream/widget/local_weather/data/?city=%E5%8C%97%E4%BA%AC");
        try {
            HttpResponse response = client.execute(httpGet);
            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode == 200){
                HttpEntity entity = response.getEntity();
                String s = entity.toString();
                Gson gson = new Gson();
                TianBean tianBean = gson.fromJson(s, TianBean.class);
                TianBean.DataBean data = tianBean.getData();
                list = new ArrayList<>();
                list.add(data);
                Message msg = new Message();
                msg.obj = list;
                h.sendMessage(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
