package com.bwie.text02.myweek;

import java.util.List;

/**
 * Created by 灬丿湿胸 on 2017/12/29.
 */

public class TianBean {

    /**
     * data : {"city":"北京","ip":"","weather":{"aqi":257,"city_name":"北京","current_condition":"多云","current_temperature":-1,"current_time":1514547850,"dat_condition":"晴","dat_high_temperature":4,"dat_low_temperature":-7,"dat_weather_icon_id":"0","day_condition":"多云","forecast_list":[{"condition":"晴","date":"2017-12-28","high_temperature":"3","low_temperature":"-4","weather_icon_id":"0","wind_direction":"北风","wind_level":"3"},{"condition":"多云转雾","date":"2017-12-29","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"南风","wind_level":"3"},{"condition":"晴","date":"2017-12-30","high_temperature":"6","low_temperature":"-6","weather_icon_id":"0","wind_direction":"北风","wind_level":"3-4"},{"condition":"晴","date":"2017-12-31","high_temperature":"4","low_temperature":"-7","weather_icon_id":"0","wind_direction":"南风","wind_level":"3"},{"condition":"多云","date":"2018-01-01","high_temperature":"3","low_temperature":"-6","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-02","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-03","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-04","high_temperature":"2","low_temperature":"-7","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"晴转阴","date":"2018-01-05","high_temperature":"2","low_temperature":"-6","weather_icon_id":"0","wind_direction":"西南风","wind_level":"3"},{"condition":"阴","date":"2018-01-06","high_temperature":"3","low_temperature":"-5","weather_icon_id":"2","wind_direction":"西北风","wind_level":"3"},{"condition":"晴","date":"2018-01-07","high_temperature":"5","low_temperature":"-4","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3"},{"condition":"多云","date":"2018-01-08","high_temperature":"5","low_temperature":"-3","weather_icon_id":"1","wind_direction":"西南风","wind_level":"3"},{"condition":"晴","date":"2018-01-09","high_temperature":"4","low_temperature":"-4","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3-4"},{"condition":"晴","date":"2018-01-10","high_temperature":"4","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西风","wind_level":"3"},{"condition":"晴","date":"2018-01-11","high_temperature":"2","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西南风","wind_level":"3"},{"condition":"晴","date":"2018-01-12","high_temperature":"3","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3"}],"high_temperature":2,"hourly_forecast":[{"condition":"阴","hour":"18","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"多云","hour":"19","temperature":"-1","weather_icon_id":"1","wind_direction":"SE","wind_level":"5"},{"condition":"阴","hour":"20","temperature":"-1","weather_icon_id":"2","wind_direction":"SE","wind_level":"5"},{"condition":"阴","hour":"21","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"5"},{"condition":"阴","hour":"22","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"7"},{"condition":"阴","hour":"23","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"7"},{"condition":"阴","hour":"0","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"5"},{"condition":"阴","hour":"1","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"阴","hour":"2","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"阴","hour":"3","temperature":"-1","weather_icon_id":"2","wind_direction":"WSW","wind_level":"5"},{"condition":"阴","hour":"4","temperature":"-1","weather_icon_id":"2","wind_direction":"WNW","wind_level":"7"},{"condition":"少云","hour":"5","temperature":"-1","weather_icon_id":"1","wind_direction":"NW","wind_level":"7"},{"condition":"少云","hour":"6","temperature":"-1","weather_icon_id":"1","wind_direction":"NW","wind_level":"9"},{"condition":"阴","hour":"7","temperature":"-1","weather_icon_id":"2","wind_direction":"NNW","wind_level":"11"},{"condition":"阴","hour":"8","temperature":"0","weather_icon_id":"2","wind_direction":"NNW","wind_level":"12"},{"condition":"阴","hour":"9","temperature":"1","weather_icon_id":"2","wind_direction":"NNW","wind_level":"14"},{"condition":"阴","hour":"10","temperature":"3","weather_icon_id":"2","wind_direction":"NW","wind_level":"20"},{"condition":"阴","hour":"11","temperature":"6","weather_icon_id":"2","wind_direction":"NW","wind_level":"22"},{"condition":"少云","hour":"12","temperature":"6","weather_icon_id":"1","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"13","temperature":"6","weather_icon_id":"0","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"14","temperature":"5","weather_icon_id":"0","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"15","temperature":"4","weather_icon_id":"0","wind_direction":"NW","wind_level":"22"},{"condition":"晴","hour":"16","temperature":"3","weather_icon_id":"0","wind_direction":"NW","wind_level":"20"},{"condition":"晴","hour":"17","temperature":"2","weather_icon_id":"0","wind_direction":"NW","wind_level":"16"},{"condition":"晴","hour":"18","temperature":"1","weather_icon_id":"0","wind_direction":"NW","wind_level":"16"},{"condition":"晴","hour":"19","temperature":"0","weather_icon_id":"0","wind_direction":"NW","wind_level":"14"}],"low_temperature":-5,"moji_city_id":2,"night_condition":"雾","quality_level":"严重","tomorrow_aqi":38,"tomorrow_condition":"晴","tomorrow_high_temperature":6,"tomorrow_low_temperature":-6,"tomorrow_quality_level":"优","tomorrow_weather_icon_id":"0","update_time":"2017-12-29 19:20:00","weather_icon_id":"31","wind_direction":"东北风","wind_level":1}}
     * message : success
     */

    private DataBean data;
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * city : 北京
         * ip :
         * weather : {"aqi":257,"city_name":"北京","current_condition":"多云","current_temperature":-1,"current_time":1514547850,"dat_condition":"晴","dat_high_temperature":4,"dat_low_temperature":-7,"dat_weather_icon_id":"0","day_condition":"多云","forecast_list":[{"condition":"晴","date":"2017-12-28","high_temperature":"3","low_temperature":"-4","weather_icon_id":"0","wind_direction":"北风","wind_level":"3"},{"condition":"多云转雾","date":"2017-12-29","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"南风","wind_level":"3"},{"condition":"晴","date":"2017-12-30","high_temperature":"6","low_temperature":"-6","weather_icon_id":"0","wind_direction":"北风","wind_level":"3-4"},{"condition":"晴","date":"2017-12-31","high_temperature":"4","low_temperature":"-7","weather_icon_id":"0","wind_direction":"南风","wind_level":"3"},{"condition":"多云","date":"2018-01-01","high_temperature":"3","low_temperature":"-6","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-02","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-03","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-04","high_temperature":"2","low_temperature":"-7","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"晴转阴","date":"2018-01-05","high_temperature":"2","low_temperature":"-6","weather_icon_id":"0","wind_direction":"西南风","wind_level":"3"},{"condition":"阴","date":"2018-01-06","high_temperature":"3","low_temperature":"-5","weather_icon_id":"2","wind_direction":"西北风","wind_level":"3"},{"condition":"晴","date":"2018-01-07","high_temperature":"5","low_temperature":"-4","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3"},{"condition":"多云","date":"2018-01-08","high_temperature":"5","low_temperature":"-3","weather_icon_id":"1","wind_direction":"西南风","wind_level":"3"},{"condition":"晴","date":"2018-01-09","high_temperature":"4","low_temperature":"-4","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3-4"},{"condition":"晴","date":"2018-01-10","high_temperature":"4","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西风","wind_level":"3"},{"condition":"晴","date":"2018-01-11","high_temperature":"2","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西南风","wind_level":"3"},{"condition":"晴","date":"2018-01-12","high_temperature":"3","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3"}],"high_temperature":2,"hourly_forecast":[{"condition":"阴","hour":"18","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"多云","hour":"19","temperature":"-1","weather_icon_id":"1","wind_direction":"SE","wind_level":"5"},{"condition":"阴","hour":"20","temperature":"-1","weather_icon_id":"2","wind_direction":"SE","wind_level":"5"},{"condition":"阴","hour":"21","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"5"},{"condition":"阴","hour":"22","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"7"},{"condition":"阴","hour":"23","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"7"},{"condition":"阴","hour":"0","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"5"},{"condition":"阴","hour":"1","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"阴","hour":"2","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"阴","hour":"3","temperature":"-1","weather_icon_id":"2","wind_direction":"WSW","wind_level":"5"},{"condition":"阴","hour":"4","temperature":"-1","weather_icon_id":"2","wind_direction":"WNW","wind_level":"7"},{"condition":"少云","hour":"5","temperature":"-1","weather_icon_id":"1","wind_direction":"NW","wind_level":"7"},{"condition":"少云","hour":"6","temperature":"-1","weather_icon_id":"1","wind_direction":"NW","wind_level":"9"},{"condition":"阴","hour":"7","temperature":"-1","weather_icon_id":"2","wind_direction":"NNW","wind_level":"11"},{"condition":"阴","hour":"8","temperature":"0","weather_icon_id":"2","wind_direction":"NNW","wind_level":"12"},{"condition":"阴","hour":"9","temperature":"1","weather_icon_id":"2","wind_direction":"NNW","wind_level":"14"},{"condition":"阴","hour":"10","temperature":"3","weather_icon_id":"2","wind_direction":"NW","wind_level":"20"},{"condition":"阴","hour":"11","temperature":"6","weather_icon_id":"2","wind_direction":"NW","wind_level":"22"},{"condition":"少云","hour":"12","temperature":"6","weather_icon_id":"1","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"13","temperature":"6","weather_icon_id":"0","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"14","temperature":"5","weather_icon_id":"0","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"15","temperature":"4","weather_icon_id":"0","wind_direction":"NW","wind_level":"22"},{"condition":"晴","hour":"16","temperature":"3","weather_icon_id":"0","wind_direction":"NW","wind_level":"20"},{"condition":"晴","hour":"17","temperature":"2","weather_icon_id":"0","wind_direction":"NW","wind_level":"16"},{"condition":"晴","hour":"18","temperature":"1","weather_icon_id":"0","wind_direction":"NW","wind_level":"16"},{"condition":"晴","hour":"19","temperature":"0","weather_icon_id":"0","wind_direction":"NW","wind_level":"14"}],"low_temperature":-5,"moji_city_id":2,"night_condition":"雾","quality_level":"严重","tomorrow_aqi":38,"tomorrow_condition":"晴","tomorrow_high_temperature":6,"tomorrow_low_temperature":-6,"tomorrow_quality_level":"优","tomorrow_weather_icon_id":"0","update_time":"2017-12-29 19:20:00","weather_icon_id":"31","wind_direction":"东北风","wind_level":1}
         */

        private String city;
        private String ip;
        private WeatherBean weather;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public WeatherBean getWeather() {
            return weather;
        }

        public void setWeather(WeatherBean weather) {
            this.weather = weather;
        }

        public static class WeatherBean {
            /**
             * aqi : 257
             * city_name : 北京
             * current_condition : 多云
             * current_temperature : -1
             * current_time : 1514547850
             * dat_condition : 晴
             * dat_high_temperature : 4
             * dat_low_temperature : -7
             * dat_weather_icon_id : 0
             * day_condition : 多云
             * forecast_list : [{"condition":"晴","date":"2017-12-28","high_temperature":"3","low_temperature":"-4","weather_icon_id":"0","wind_direction":"北风","wind_level":"3"},{"condition":"多云转雾","date":"2017-12-29","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"南风","wind_level":"3"},{"condition":"晴","date":"2017-12-30","high_temperature":"6","low_temperature":"-6","weather_icon_id":"0","wind_direction":"北风","wind_level":"3-4"},{"condition":"晴","date":"2017-12-31","high_temperature":"4","low_temperature":"-7","weather_icon_id":"0","wind_direction":"南风","wind_level":"3"},{"condition":"多云","date":"2018-01-01","high_temperature":"3","low_temperature":"-6","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-02","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-03","high_temperature":"2","low_temperature":"-5","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"多云","date":"2018-01-04","high_temperature":"2","low_temperature":"-7","weather_icon_id":"1","wind_direction":"东北风","wind_level":"3"},{"condition":"晴转阴","date":"2018-01-05","high_temperature":"2","low_temperature":"-6","weather_icon_id":"0","wind_direction":"西南风","wind_level":"3"},{"condition":"阴","date":"2018-01-06","high_temperature":"3","low_temperature":"-5","weather_icon_id":"2","wind_direction":"西北风","wind_level":"3"},{"condition":"晴","date":"2018-01-07","high_temperature":"5","low_temperature":"-4","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3"},{"condition":"多云","date":"2018-01-08","high_temperature":"5","low_temperature":"-3","weather_icon_id":"1","wind_direction":"西南风","wind_level":"3"},{"condition":"晴","date":"2018-01-09","high_temperature":"4","low_temperature":"-4","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3-4"},{"condition":"晴","date":"2018-01-10","high_temperature":"4","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西风","wind_level":"3"},{"condition":"晴","date":"2018-01-11","high_temperature":"2","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西南风","wind_level":"3"},{"condition":"晴","date":"2018-01-12","high_temperature":"3","low_temperature":"-5","weather_icon_id":"0","wind_direction":"西北风","wind_level":"3"}]
             * high_temperature : 2
             * hourly_forecast : [{"condition":"阴","hour":"18","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"多云","hour":"19","temperature":"-1","weather_icon_id":"1","wind_direction":"SE","wind_level":"5"},{"condition":"阴","hour":"20","temperature":"-1","weather_icon_id":"2","wind_direction":"SE","wind_level":"5"},{"condition":"阴","hour":"21","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"5"},{"condition":"阴","hour":"22","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"7"},{"condition":"阴","hour":"23","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"7"},{"condition":"阴","hour":"0","temperature":"-1","weather_icon_id":"2","wind_direction":"SSE","wind_level":"5"},{"condition":"阴","hour":"1","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"阴","hour":"2","temperature":"-1","weather_icon_id":"2","wind_direction":"S","wind_level":"5"},{"condition":"阴","hour":"3","temperature":"-1","weather_icon_id":"2","wind_direction":"WSW","wind_level":"5"},{"condition":"阴","hour":"4","temperature":"-1","weather_icon_id":"2","wind_direction":"WNW","wind_level":"7"},{"condition":"少云","hour":"5","temperature":"-1","weather_icon_id":"1","wind_direction":"NW","wind_level":"7"},{"condition":"少云","hour":"6","temperature":"-1","weather_icon_id":"1","wind_direction":"NW","wind_level":"9"},{"condition":"阴","hour":"7","temperature":"-1","weather_icon_id":"2","wind_direction":"NNW","wind_level":"11"},{"condition":"阴","hour":"8","temperature":"0","weather_icon_id":"2","wind_direction":"NNW","wind_level":"12"},{"condition":"阴","hour":"9","temperature":"1","weather_icon_id":"2","wind_direction":"NNW","wind_level":"14"},{"condition":"阴","hour":"10","temperature":"3","weather_icon_id":"2","wind_direction":"NW","wind_level":"20"},{"condition":"阴","hour":"11","temperature":"6","weather_icon_id":"2","wind_direction":"NW","wind_level":"22"},{"condition":"少云","hour":"12","temperature":"6","weather_icon_id":"1","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"13","temperature":"6","weather_icon_id":"0","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"14","temperature":"5","weather_icon_id":"0","wind_direction":"NW","wind_level":"24"},{"condition":"晴","hour":"15","temperature":"4","weather_icon_id":"0","wind_direction":"NW","wind_level":"22"},{"condition":"晴","hour":"16","temperature":"3","weather_icon_id":"0","wind_direction":"NW","wind_level":"20"},{"condition":"晴","hour":"17","temperature":"2","weather_icon_id":"0","wind_direction":"NW","wind_level":"16"},{"condition":"晴","hour":"18","temperature":"1","weather_icon_id":"0","wind_direction":"NW","wind_level":"16"},{"condition":"晴","hour":"19","temperature":"0","weather_icon_id":"0","wind_direction":"NW","wind_level":"14"}]
             * low_temperature : -5
             * moji_city_id : 2
             * night_condition : 雾
             * quality_level : 严重
             * tomorrow_aqi : 38
             * tomorrow_condition : 晴
             * tomorrow_high_temperature : 6
             * tomorrow_low_temperature : -6
             * tomorrow_quality_level : 优
             * tomorrow_weather_icon_id : 0
             * update_time : 2017-12-29 19:20:00
             * weather_icon_id : 31
             * wind_direction : 东北风
             * wind_level : 1
             */

            private int aqi;
            private String city_name;
            private String current_condition;
            private int current_temperature;
            private int current_time;
            private String dat_condition;
            private int dat_high_temperature;
            private int dat_low_temperature;
            private String dat_weather_icon_id;
            private String day_condition;
            private int high_temperature;
            private int low_temperature;
            private int moji_city_id;
            private String night_condition;
            private String quality_level;
            private int tomorrow_aqi;
            private String tomorrow_condition;
            private int tomorrow_high_temperature;
            private int tomorrow_low_temperature;
            private String tomorrow_quality_level;
            private String tomorrow_weather_icon_id;
            private String update_time;
            private String weather_icon_id;
            private String wind_direction;
            private int wind_level;
            private List<ForecastListBean> forecast_list;
            private List<HourlyForecastBean> hourly_forecast;

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getCurrent_condition() {
                return current_condition;
            }

            public void setCurrent_condition(String current_condition) {
                this.current_condition = current_condition;
            }

            public int getCurrent_temperature() {
                return current_temperature;
            }

            public void setCurrent_temperature(int current_temperature) {
                this.current_temperature = current_temperature;
            }

            public int getCurrent_time() {
                return current_time;
            }

            public void setCurrent_time(int current_time) {
                this.current_time = current_time;
            }

            public String getDat_condition() {
                return dat_condition;
            }

            public void setDat_condition(String dat_condition) {
                this.dat_condition = dat_condition;
            }

            public int getDat_high_temperature() {
                return dat_high_temperature;
            }

            public void setDat_high_temperature(int dat_high_temperature) {
                this.dat_high_temperature = dat_high_temperature;
            }

            public int getDat_low_temperature() {
                return dat_low_temperature;
            }

            public void setDat_low_temperature(int dat_low_temperature) {
                this.dat_low_temperature = dat_low_temperature;
            }

            public String getDat_weather_icon_id() {
                return dat_weather_icon_id;
            }

            public void setDat_weather_icon_id(String dat_weather_icon_id) {
                this.dat_weather_icon_id = dat_weather_icon_id;
            }

            public String getDay_condition() {
                return day_condition;
            }

            public void setDay_condition(String day_condition) {
                this.day_condition = day_condition;
            }

            public int getHigh_temperature() {
                return high_temperature;
            }

            public void setHigh_temperature(int high_temperature) {
                this.high_temperature = high_temperature;
            }

            public int getLow_temperature() {
                return low_temperature;
            }

            public void setLow_temperature(int low_temperature) {
                this.low_temperature = low_temperature;
            }

            public int getMoji_city_id() {
                return moji_city_id;
            }

            public void setMoji_city_id(int moji_city_id) {
                this.moji_city_id = moji_city_id;
            }

            public String getNight_condition() {
                return night_condition;
            }

            public void setNight_condition(String night_condition) {
                this.night_condition = night_condition;
            }

            public String getQuality_level() {
                return quality_level;
            }

            public void setQuality_level(String quality_level) {
                this.quality_level = quality_level;
            }

            public int getTomorrow_aqi() {
                return tomorrow_aqi;
            }

            public void setTomorrow_aqi(int tomorrow_aqi) {
                this.tomorrow_aqi = tomorrow_aqi;
            }

            public String getTomorrow_condition() {
                return tomorrow_condition;
            }

            public void setTomorrow_condition(String tomorrow_condition) {
                this.tomorrow_condition = tomorrow_condition;
            }

            public int getTomorrow_high_temperature() {
                return tomorrow_high_temperature;
            }

            public void setTomorrow_high_temperature(int tomorrow_high_temperature) {
                this.tomorrow_high_temperature = tomorrow_high_temperature;
            }

            public int getTomorrow_low_temperature() {
                return tomorrow_low_temperature;
            }

            public void setTomorrow_low_temperature(int tomorrow_low_temperature) {
                this.tomorrow_low_temperature = tomorrow_low_temperature;
            }

            public String getTomorrow_quality_level() {
                return tomorrow_quality_level;
            }

            public void setTomorrow_quality_level(String tomorrow_quality_level) {
                this.tomorrow_quality_level = tomorrow_quality_level;
            }

            public String getTomorrow_weather_icon_id() {
                return tomorrow_weather_icon_id;
            }

            public void setTomorrow_weather_icon_id(String tomorrow_weather_icon_id) {
                this.tomorrow_weather_icon_id = tomorrow_weather_icon_id;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getWeather_icon_id() {
                return weather_icon_id;
            }

            public void setWeather_icon_id(String weather_icon_id) {
                this.weather_icon_id = weather_icon_id;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public int getWind_level() {
                return wind_level;
            }

            public void setWind_level(int wind_level) {
                this.wind_level = wind_level;
            }

            public List<ForecastListBean> getForecast_list() {
                return forecast_list;
            }

            public void setForecast_list(List<ForecastListBean> forecast_list) {
                this.forecast_list = forecast_list;
            }

            public List<HourlyForecastBean> getHourly_forecast() {
                return hourly_forecast;
            }

            public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast) {
                this.hourly_forecast = hourly_forecast;
            }

            public static class ForecastListBean {
                /**
                 * condition : 晴
                 * date : 2017-12-28
                 * high_temperature : 3
                 * low_temperature : -4
                 * weather_icon_id : 0
                 * wind_direction : 北风
                 * wind_level : 3
                 */

                private String condition;
                private String date;
                private String high_temperature;
                private String low_temperature;
                private String weather_icon_id;
                private String wind_direction;
                private String wind_level;

                public String getCondition() {
                    return condition;
                }

                public void setCondition(String condition) {
                    this.condition = condition;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getHigh_temperature() {
                    return high_temperature;
                }

                public void setHigh_temperature(String high_temperature) {
                    this.high_temperature = high_temperature;
                }

                public String getLow_temperature() {
                    return low_temperature;
                }

                public void setLow_temperature(String low_temperature) {
                    this.low_temperature = low_temperature;
                }

                public String getWeather_icon_id() {
                    return weather_icon_id;
                }

                public void setWeather_icon_id(String weather_icon_id) {
                    this.weather_icon_id = weather_icon_id;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_level() {
                    return wind_level;
                }

                public void setWind_level(String wind_level) {
                    this.wind_level = wind_level;
                }
            }

            public static class HourlyForecastBean {
                /**
                 * condition : 阴
                 * hour : 18
                 * temperature : -1
                 * weather_icon_id : 2
                 * wind_direction : S
                 * wind_level : 5
                 */

                private String condition;
                private String hour;
                private String temperature;
                private String weather_icon_id;
                private String wind_direction;
                private String wind_level;

                public String getCondition() {
                    return condition;
                }

                public void setCondition(String condition) {
                    this.condition = condition;
                }

                public String getHour() {
                    return hour;
                }

                public void setHour(String hour) {
                    this.hour = hour;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather_icon_id() {
                    return weather_icon_id;
                }

                public void setWeather_icon_id(String weather_icon_id) {
                    this.weather_icon_id = weather_icon_id;
                }

                public String getWind_direction() {
                    return wind_direction;
                }

                public void setWind_direction(String wind_direction) {
                    this.wind_direction = wind_direction;
                }

                public String getWind_level() {
                    return wind_level;
                }

                public void setWind_level(String wind_level) {
                    this.wind_level = wind_level;
                }
            }
        }
    }
}
