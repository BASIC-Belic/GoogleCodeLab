package com.example.android.googlecodelab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {

    //static variable TOTAL_COUNT, to use as the key for the extra data.
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This method sets the layout of the new activity to activity_second.xml.
        setContentView(R.layout.activity_second)
        // method shows random num
        showRandomNumber()
    }

    fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        // Add one because the bound is exclusive if not 0
        val randomInt = if (count == 0) 0 else random.nextInt(count + 1)


        // Display the random number.
        findViewById<TextView>(R.id.textView_random).text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textView_label).text = getString(R.string.random_heading, count)

    }


}
