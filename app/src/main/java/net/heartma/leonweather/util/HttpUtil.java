package net.heartma.leonweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * 封装与服务器交互
 */
public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
