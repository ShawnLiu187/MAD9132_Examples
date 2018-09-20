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


    //The first function called:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the EditText field
        val editText = findViewById<EditText>(R.id.firstView)

        //open the sharedpreferences file called SavedData
        val prefs = getSharedPreferences("SavedData", Context.MODE_PRIVATE)

        //Look for the value reserved under the name UserInput. If not there, return Default answer
        val userString = prefs.getString("UserInput", "Default answer")

        //A logging message at the error level of priority
        Log.e("In MainActivity", "string found is:" + userString)

        //put the string found from the user preferences into the EditText field
        editText.setText(userString)

        //Find the button firstButton:
        var button1 = findViewById(R.id.firstButton) as? Button

        //add a click handler:
        button1?.setOnClickListener( View.OnClickListener {

            // create an Intent to go to the Activity InformationActivity:
            val newActivity = Intent( this, InformationActivity::class.java);

            //Get what the user typed in the editText:
            val typedString = editText.getText().toString()


            //get an editor object to saved to SharedPreferences:
            val prefs = prefs.edit()

            //Under the name UserInput, save what the user typed:
            prefs.putString("UserInput", typedString)

            //Under the name Age, save 10 just for demonstration purposes:
            prefs.putInt("Age", 10)

            prefs.commit()//writes a file

            //Put the user string under the reservation "UserName" to send to the next page
            newActivity.putExtra("UserName", typedString)

            //transition to the new page:
            startActivityForResult(newActivity, 100)
        })



        //this finds secondButton and adds a click handler that goes to ListActivity page
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

    //This function gets called after another page finished and we return to this activity
    override fun onActivityResult(request:Int, result:Int, dat:Intent?)
    {
        Log.i("Hello", "Welcome back")
    }

}
