package com.example.android.googlecodelab

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Add a new method called toastMe() to the MainActivity class.
    // The toastMe() method takes a single argument of a View.
    // This is the view that receives the click event.

    fun toastMe(view: View) =
    // Toast.makeText(this, message, duration)
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()

    //This method will be invoked when the Count button is clicked,
    // so it is public, has no return statement, and has a single View argument.
    fun countMe(view: View) {
        // Get the text view
        val showTextCountView = findViewById<TextView>(R.id.textView_num)
        // Get the value of the text view.
        val countString = showTextCountView.text.toString()
        // Convert value to a number and increment it
        var currCount:Int = Integer.parseInt(countString)
        currCount++
        // Display the new value in the text view.
        showTextCountView.text = currCount.toString()
    }

    fun randomMe(view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the current value of the text view.
        val countString = findViewById<TextView>(R.id.textView_num).text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        // putExtra takes key/val pair
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        //put Extra takes key, value pair
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }

}
