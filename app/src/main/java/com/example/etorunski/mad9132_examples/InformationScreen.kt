package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformationScreen : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information_screen)


        val textField = findViewById(R.id.welcome) as? TextView

        val intnt = intent;

        var userString = intent.getStringExtra( "UserInput" );

        textField!!.setText("Welcome " + userString)

        val finishButton = findViewById<Button>(R.id.finishedButton)
        finishButton.setOnClickListener( { click ->
            setResult(535)
            finish()  })


    }
}
