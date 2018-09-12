package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById(R.id.firstView) as? EditText

        textView?.setOnClickListener(View.OnClickListener { Log.i("Clicked", "Clicked") })




    }
}
