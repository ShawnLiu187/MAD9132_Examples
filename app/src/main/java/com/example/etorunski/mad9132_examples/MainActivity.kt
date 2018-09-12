package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById(R.id.firstView) as? EditText


        var button1 = findViewById(R.id.firstButton) as? Button
        button1?.setOnClickListener( View.OnClickListener {
            textView?.setText("You clicked button 1")

        })


        var button2 = findViewById(R.id.secondButton) as? Button

        button2?.setOnClickListener(View.OnClickListener {
            textView?.setText("You clicked button 2")
        })
    }
}
