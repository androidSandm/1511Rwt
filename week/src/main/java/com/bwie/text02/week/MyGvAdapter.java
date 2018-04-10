package com.bwie.text02.week;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.BitSet;
import java.util.List;

/**
 * Created by 灬丿湿胸 on 2017/12/30.
 */

public class MyGvAdapter extends BaseAdapter {
    private Context context;
    private List<GoodBean2.DataBean> list;

    public MyGvAdapter(Context context, List<GoodBean2.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            view = View.inflate(context,R.layout.gvitem,null);
            holder.img = view.findViewById(R.id.imageView2);
            holder.name = view.findViewById(R.id.textView3);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(list.get(i).getName());


        MyGvImg gvImg = new MyGvImg(holder.img);
        gvImg.execute(list.get(i).getList().get(i).getIcon());
        return view;
    }
    class ViewHolder{
        ImageView img;
        TextView name;
    }
    class MyGvImg extends AsyncTask<String,Void,Bitmap>{
        private ImageView img;

        public MyGvImg(ImageView img) {
            this.img = img;
        }

        @Override
        protected Bitmap doInBackground(String... strings) {

            URL url = null;
            try {
                url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");
                urlConnection.setReadTimeout(5000);
                urlConnection.setConnectTimeout(5000);

                int responseCode = urlConnection.getResponseCode();
                if(responseCode == 200){
                    InputStream inputStream = urlConnection.getInputStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    return bitmap;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if(bitmap == null){
                img.setImageResource(R.mipmap.ic_launcher_round);
            }else{
                img.setImageBitmap(bitmap);
            }
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }
    }
}
