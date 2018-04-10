package com.bwie.text02.week;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private GridView gv;
    private Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            GoodBean2 good = (GoodBean2) msg.obj;
            List<GoodBean2.DataBean> data = good.getData();
            MyGvAdapter adapter = new MyGvAdapter(Main2Activity.this,data);
            gv.setAdapter(adapter);
        }
    };
    private int cid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gv = findViewById(R.id.gv);

        Intent intent = getIntent();
        cid = intent.getIntExtra("cid",0);

        new Thread(){
            @Override
            public void run() {
                getGood();
            }
        }.start();
    }
    public void getGood(){
        SSLSocketFactory.getSocketFactory().setHostnameVerifier(new AllowAllHostnameVerifier());
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("https://www.zhaoapi.cn/product/getProductCatagory?cid=" + cid);

        try {
            HttpResponse execute = client.execute(httpGet);

            int statusCode = execute.getStatusLine().getStatusCode();
            if(statusCode == 200){
                HttpEntity entity = execute.getEntity();
                String s = EntityUtils.toString(entity);
                Gson gson = new Gson();
                GoodBean2 goodBean2 = gson.fromJson(s, GoodBean2.class);
                Message msg = new Message();
                msg.obj = goodBean2;
                h.sendMessage(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
