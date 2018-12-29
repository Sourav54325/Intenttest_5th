package com.errorfoundtechnologies.intenttest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bu1.setOnClickListener {
            var i = intent
            i = Intent(this@MainActivity,Main2Activity::class.java)
            i.putExtra("abc","123".toString())
            startActivity(i)
        }

        bu2.setOnClickListener {
            var a =packageManager.getLaunchIntentForPackage("com.whatsapp")
            startActivity(a)
        }
    }
}
