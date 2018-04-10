package com.bwie.text02.text02;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 灬丿湿胸 on 2017/12/27.
 */

public class MyAdapter extends BaseAdapter{
    private Context context;
    private List<Joke.NewslistBean> list;

    public MyAdapter(Context context, List<Joke.NewslistBean> list) {
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
        if (view == null){
            holder = new ViewHolder();
            view = View.inflate(context,R.layout.item,null);
            holder.text1 = view.findViewById(R.id.textView);
            holder.text2 = view.findViewById(R.id.textView2);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.text1.setText(list.get(i).getDescription());
        holder.text2.setText(list.get(i).getTitle());
        return view;
    }
    class ViewHolder{
        TextView text1,text2;
    }
}
