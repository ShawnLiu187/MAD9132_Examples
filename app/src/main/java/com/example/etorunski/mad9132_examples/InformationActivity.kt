package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformationActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_information_screen )

        //get the intent object that caused the transition:
        var intnt = getIntent()


        //look for the string reserved under "UserName"
        var userInput = intnt.getStringExtra("UserName")


        //get the TextView at the top of the page
        var textView = findViewById<TextView>(R.id.welcome)

        //set the text to be what the user typed in from the previous page
        textView.setText(userInput)


        //get the finish button
        var finishButton = findViewById<Button>(R.id.finishedButton)
        finishButton.setOnClickListener(  {

            //set the result to be a unique number:
            setResult(489237598)

            //stop running this Activity and return to the previous one:
            finish()
        })
    }
}
