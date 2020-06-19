package com.example.myapplication123

import android.content.Context
import com.qihoo360.replugin.RePlugin
import com.qihoo360.replugin.RePluginApplication
import com.qihoo360.replugin.RePluginConfig

class MyApplication : RePluginApplication() {


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

        RePlugin.enableDebugger(base, BuildConfig.DEBUG);
    }

    override fun createConfig(): RePluginConfig {

        val c = RePluginConfig();
        c.setVerifySign(!BuildConfig.DEBUG);

        return c;
    }


}