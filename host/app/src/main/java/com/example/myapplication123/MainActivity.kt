package com.example.myapplication123


import android.app.Activity
import android.os.Bundle
import android.view.View
import com.qihoo360.replugin.RePlugin
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_1.setOnClickListener(View.OnClickListener {
            RePlugin.startActivity(
                this,
                RePlugin.createIntent("app-debug", "com.example.myapplication.Main")
            )

        })





        btn_2.setOnClickListener(View.OnClickListener {
            RePlugin.startActivity(
                this,
                RePlugin.createIntent("app-debug", "com.example.myapplication.Main2")
            )
        })

    }

}
