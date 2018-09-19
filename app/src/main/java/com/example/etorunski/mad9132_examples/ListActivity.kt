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
            setResult(88)
            finish()
        })
    }
}
