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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.firstView) as? EditText

        val prefs = getSharedPreferences("MyFile", Context.MODE_PRIVATE)


        val previousString = prefs.getString("PREVIOUS_NAME", "New Name")
        editText!!.setText(previousString)


        var button1 = findViewById(R.id.firstButton) as? Button
        button1?.setOnClickListener( View.OnClickListener {

            Log.e("MainActivity", "Saved shared preferences")

            var userInput = editText!!.getText().toString()

            val editor = prefs.edit()
            editor.putString("PREVIOUS_NAME", userInput)

            editor.commit()

            val newActivity = Intent( this, InformationScreen::class.java)

            newActivity.putExtra("UserInput", userInput)

            startActivityForResult( newActivity , 50)


        })


        var button2 = findViewById(R.id.secondButton) as? Button
        button2?.setOnClickListener(View.OnClickListener {

            var userInput = editText!!.getText().toString()

            val editor = prefs.edit()
            editor.putString("PREVIOUS_NAME", userInput)

            editor.commit()

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
