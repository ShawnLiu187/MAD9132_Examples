package com.example.etorunski.mad9132_examples

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {

    val ACTIVITY_NAME = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.firstView)


        var button1 = findViewById(R.id.firstButton) as? Button
        button1?.setOnClickListener( View.OnClickListener {


            val newActivity = Intent( this, InformationActivity::class.java);
            val typedString = editText.getText().toString()
            newActivity.putExtra("UserName", typedString)
            startActivityForResult(newActivity, 100)

        })


        var button2 = findViewById(R.id.secondButton) as? Button
        button2?.setOnClickListener(View.OnClickListener {

            val newActivity = Intent( this, ListActivity::class.java);
            startActivityForResult(newActivity, 200)
        })
    }

    //This gets called after onCreate()
    override fun onStart()
    {
        super.onStart()
        Log.i(ACTIVITY_NAME, "In onStart")
    }


    //This gets called after onStart()
    override fun onResume()
    {
        super.onResume()
        Log.i(ACTIVITY_NAME, "In OnResume")
    }

    override fun onActivityResult(request:Int, result:Int, dat:Intent?)
    {
        Log.i("Hello", "Welcome back")
    }

}
