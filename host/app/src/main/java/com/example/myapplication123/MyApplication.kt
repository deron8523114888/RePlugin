package com.example.myapplication123

import android.content.Context
import android.content.res.Configuration
import com.qihoo360.replugin.RePlugin
import com.qihoo360.replugin.RePluginApplication
import com.qihoo360.replugin.RePluginConfig

class MyApplication : RePluginApplication() {


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

        RePlugin.enableDebugger(base, BuildConfig.DEBUG);
        RePlugin.App.attachBaseContext(this);
    }

    override fun createConfig(): RePluginConfig {

        val c = RePluginConfig();
        c.setVerifySign(!BuildConfig.DEBUG);

        return c;
    }

    override fun onCreate() {
        super.onCreate()

        RePlugin.App.onCreate()
    }

    override fun onLowMemory() {
        super.onLowMemory()

        RePlugin.App.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)

        RePlugin.App.onTrimMemory(level)
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        RePlugin.App.onConfigurationChanged(newConfig)
    }


}