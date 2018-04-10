package com.bwie.text02.myweek;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 灬丿湿胸 on 2017/12/29.
 */

public class MyGridAdapter extends BaseAdapter {
    private Context context;
    private List<TianBean.DataBean.WeatherBean.ForecastListBean> list11;

    public MyGridAdapter(Context context, List<TianBean.DataBean.WeatherBean.ForecastListBean> list11) {
        this.context = context;
        this.list11 = list11;
    }

    @Override
    public int getCount() {
        return list11.size();
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
            view = View.inflate(context,R.layout.grid_view,null);
            holder.date = view.findViewById(R.id.date);
            holder.high_temperature = view.findViewById(R.id.high_temperature);
            holder.low_temperature = view.findViewById(R.id.low_temperature);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.date.setText(list11.get(i).getDate());
        holder.high_temperature.setText(list11.get(i).getHigh_temperature()+"℃");
        holder.low_temperature.setText(list11.get(i).getLow_temperature()+"℃");
        return view;
    }
    class ViewHolder{
        TextView date,high_temperature,low_temperature;
    }
}
