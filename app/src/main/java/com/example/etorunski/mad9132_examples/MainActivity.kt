package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById(R.id.firstView) as? EditText


        var button1 = findViewById(R.id.firstButton) as? Button
        button1?.setOnClickListener( View.OnClickListener {
            editText?.setText("You clicked button 1")

        })


        val intent = Intent(this, MainActivity::class.java)

        var button2 = findViewById(R.id.secondButton) as? Button


        button2?.setOnClickListener(View.OnClickListener {
            editText?.setText("You clicked button 2")
            val newActivity = Intent(Intent.ACTION_SEND)
            newActivity.setType("text/plain")
            newActivity.putExtra(Intent.EXTRA_EMAIL, arrayOf("email@algonquincollege.com", "OtherEmail@email.com"))
        })



    }
}
