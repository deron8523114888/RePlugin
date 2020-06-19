package com.example.myapplication123


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.qihoo360.replugin.RePlugin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        RePlugin.preload("son")

//        val info = RePlugin.getPluginInfo("com.example.myapplication")
//        Log.v("info_",""+info)


        val intent = RePlugin.createIntent("com.example.myapplication", "com.example.myapplication.MainActivity")
        RePlugin.startActivity(this, intent)


    }
}
