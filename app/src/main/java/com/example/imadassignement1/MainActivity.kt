package com.example.imadassignement1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//ViewCompat
        //Code starts here
        //Declarations
        val tvMainTitle = findViewById<TextView>(R.id.tvMainTitle)
        val edtToD = findViewById<EditText>(R.id.edtToD)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        //variables
        var timeOfDay: String
        //functions
        btnSubmit.setOnClickListener()
        {
            //Input time of day here (morning, afternoon, night)
            timeOfDay = edtToD.text.toString()
            //Outputting information from variables to spark
            Toast.makeText(this, "Your code works somehow $timeOfDay", Toast.LENGTH_LONG).show()
        }

        //Code ends here
    }//Override function onCreate
}//class MainActivity
//Data classes go below here