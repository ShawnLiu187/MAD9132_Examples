package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class ListActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_screen)


        var button = findViewById< Button >(R.id.doneButton)
        button.setOnClickListener({

            //set the result to be a unique number:
            setResult(88)

            //return to the previous activity:
            finish()
        })
    }
}
