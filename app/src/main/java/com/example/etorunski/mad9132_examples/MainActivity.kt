package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.firstView) as? EditText


        var button1 = findViewById(R.id.firstButton) as? Button
        button1?.setOnClickListener( View.OnClickListener {

            val newActivity = Intent( this, InformationScreen::class.java)

            newActivity.putExtra("UserInput", editText!!.getText().toString())

            startActivityForResult( newActivity , 50)


        })


        var button2 = findViewById(R.id.secondButton) as? Button
        button2?.setOnClickListener(View.OnClickListener {

            val newActivity = Intent( this, ListScreen::class.java)

            startActivityForResult( newActivity , 296)

        })
    }

    override fun onActivityResult(request:Int, result:Int, dat:Intent?)
    {

        //request will always be 50
        //result will always be 535, unless hit back button
        Log.i("Result", "is " +result)
    }

}
