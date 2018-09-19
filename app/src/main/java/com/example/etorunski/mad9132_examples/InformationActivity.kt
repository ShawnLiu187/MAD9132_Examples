package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformationActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_information_screen )

        var intnt = getIntent()

        var userInput = intnt.getStringExtra("UserName")

        var textView = findViewById<TextView>(R.id.welcome)
        textView.setText(userInput)


        var finishButton = findViewById<Button>(R.id.finishedButton)
        finishButton.setOnClickListener(  {
            setResult(489237598)
            finish()
        })
    }
}
