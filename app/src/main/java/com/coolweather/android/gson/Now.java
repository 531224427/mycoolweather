package com.coolweather.android.gson;

import com.coolweather.android.db.Province;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jiangy on 2018/11/29.
 */

public class Now {
     @SerializedName("tmp")
    public String temperture;
    @SerializedName("cond")
     public More more;
    public class More{
@SerializedName("txt")
        public String info;
    }
}
