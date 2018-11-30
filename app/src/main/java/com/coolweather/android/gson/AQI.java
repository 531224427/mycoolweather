package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jiangy on 2018/11/29.
 */

public class AQI {

    public AQICity city;

    public class  AQICity{
     public String aqi;
        public String pm25;
    }
}
