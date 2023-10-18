package com.cvetler.emptyapplicationtemplate

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : Activity() {
    //Buttons
    private var button1: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        val context: Context = this
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        button1 = findViewById<View>(R.id.button1_id) as Button
        button1!!.setOnClickListener {
            val site2 = "https://paypal.me/Cvetler"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(site2)
            startActivity(i)
        }
    }
}