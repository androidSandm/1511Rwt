package com.bwie.text02.myweek;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 灬丿湿胸 on 2017/12/29.
 */

public class Myadapter extends BaseAdapter {
    private Context context;
    private List<TianBean.DataBean> list;

    public Myadapter(Context context, List<TianBean.DataBean> list) {
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
            view = View.inflate(context,R.layout.list_view,null);
            holder.aqi = view.findViewById(R.id.aqi);
            holder.bluetooth = view.findViewById(R.id.aqi);
            holder.city_name = view.findViewById(R.id.aqi);
            holder.current_condition = view.findViewById(R.id.aqi);
            holder.current_temperature = view.findViewById(R.id.aqi);
            holder.grid = view.findViewById(R.id.grid);
            holder.high_temperature = view.findViewById(R.id.aqi);
            holder.wifi = view.findViewById(R.id.aqi);
            holder.low_temperature = view.findViewById(R.id.aqi);
            holder.wind_direction = view.findViewById(R.id.aqi);
            holder.update_time = view.findViewById(R.id.aqi);
            holder.quality_level = view.findViewById(R.id.aqi);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        TianBean.DataBean dataBean = list.get(i);
        //给组件赋值
        holder.current_temperature.setText(dataBean.getWeather().getCurrent_temperature()+"℃");
        holder.high_temperature.setText(dataBean.getWeather().getHigh_temperature()+"℃");
        holder.low_temperature.setText(dataBean.getWeather().getLow_temperature()+"℃");
        holder.current_condition.setText(dataBean.getWeather().getCurrent_condition());
        holder.wind_direction.setText(dataBean.getWeather().getWind_direction()+dataBean.getWeather().getWind_level()+"级");
        holder.update_time.setText(dataBean.getWeather().getUpdate_time());
        holder.city_name.setText(dataBean.getWeather().getCity_name());
        holder.aqi.setText("空气污染指数:"+dataBean.getWeather().getAqi());
        holder.quality_level.setText(dataBean.getWeather().getQuality_level());

        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        int state = adapter.getState();
        switch (state){
            case BluetoothAdapter.STATE_OFF:
                holder.bluetooth.setText("蓝牙状态：关");
                break;
            case BluetoothAdapter.STATE_ON:
                holder.bluetooth.setText("蓝牙状态：开");
                 break;
        }

        WifiManager manager = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        int wifiState = manager.getWifiState();
        switch (wifiState){
            case WifiManager.WIFI_STATE_ENABLED:
                holder.wifi.setText("WIFI状态:开");
                break;
            case WifiManager.WIFI_STATE_DISABLED:
                holder.wifi.setText("WIFI状态:关");
        }

        List<TianBean.DataBean.WeatherBean.ForecastListBean> list11 = dataBean.getWeather().getForecast_list();
        MyGridAdapter adapter1=new MyGridAdapter(context,list11);
        holder.grid.setAdapter(adapter1);


        return view;
    }
    class ViewHolder{
        TextView current_temperature,low_temperature,high_temperature,
                current_condition,wind_direction, update_time,city_name,aqi,quality_level,
                wifi,bluetooth;
        GridView grid;
    }
}
