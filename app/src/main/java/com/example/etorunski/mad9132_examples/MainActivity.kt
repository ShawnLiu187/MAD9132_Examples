package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var aNumber = 10

        if( aNumber < 20) {
            Log.i("Output", "A number is less than 20")
        }
        else
            Log.i("Output", "A number is greater than 20")

        val aList = listOf("First", "Second", "Third")
        aList[1]
        for(index in 0 .. (aList.size -1))
        {
            Log.i("Index", ""+index)
        }
    }
}
