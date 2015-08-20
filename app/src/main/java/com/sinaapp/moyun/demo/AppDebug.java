package com.sinaapp.moyun.demo;

import android.app.Application;
import com.facebook.stetho.Stetho;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by Moy on 八月20  020.LeakCanary
 Stetho
 OkHttp
 */
public class AppDebug extends Application {

    RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(Stetho.newInitializerBuilder(this).enableDumpapp(Stetho.defaultDumperPluginsProvider(this)).enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this)).build());
        refWatcher = LeakCanary.install(this);
    }
}
