package com.sinaapp.moyun.demo.net;

import com.facebook.stetho.okhttp.StethoInterceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Moy on 八月20  020.
 */
public class Net {
    private static final boolean debug = true;
    private static OkHttpClient okHttpClient = new OkHttpClient();
    static {
        if (debug) {
            // 开启拦截
            okHttpClient.networkInterceptors().add(new StethoInterceptor());
        }
    }

    public static String likeNet(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        return response.body().string();
    }
}
