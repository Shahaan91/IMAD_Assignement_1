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
            //Outputting information from variables to spark with elseifs
            if (timeOfDay.equals("Morning", ignoreCase = true)) {
                tvMainTitle.text = "Send a Good Morning Text to a family member."
            } else if (timeOfDay.equals("Mid-morning", ignoreCase = true)) {
                tvMainTitle.text = "Reach out to a colleague with a quick thank you."
            } else if (timeOfDay.equals("Afternoon", ignoreCase = true)) {
                tvMainTitle.text = "Share a funny meme or interesting link with your friend."
            } else if (timeOfDay.equals("Afternoon Snack Time", ignoreCase = true)) {
                tvMainTitle.text = "Send a quick thinking of you message."
            } else if (timeOfDay.equals("Dinner", ignoreCase = true)) {
                tvMainTitle.text = "Call a friend or relative for a 5-minute catch-up."
            } else if (timeOfDay.equals("After dinner", ignoreCase = true)) {
                tvMainTitle.text = "Leave a thoughtful comment on a friends' post."
            } else {
                tvMainTitle.text =
                    "Whoops! you seem to have made a typo. Try: Morning, Mid-morning, Afternoon, Afternoon Snack Time, Dinner, or After dinner. "
            }
        }
            btnReset.setOnClickListener{
                edtToD.text.clear()
            }



        //Code ends here
    }//Override function onCreate
}//class MainActivity
