package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class ListScreen : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_screen)

        val doneButton = findViewById<Button>(R.id.doneButton)
        doneButton.setOnClickListener( { click ->
            setResult(2)
            finish()
        })
    }
}
