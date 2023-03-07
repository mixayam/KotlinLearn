package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val KEY_ENTERED_TEXT = "ENTERED_TEXT"
class SecondActivity : AppCompatActivity() {

    private lateinit var textViewEntered: TextView
    private lateinit var buttonGoToThirdActivity: Button
    private lateinit var buttonGoBackToFirst: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "SecondActivity before onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "SecondActivity onCreate")
        val enteredText: String? = intent.getStringExtra(KEY_ENTERED_TEXT)
        textViewEntered = findViewById(R.id.textViewEntered)
        textViewEntered.setText(enteredText)
        buttonGoToThirdActivity = findViewById(R.id.buttonGoToThirdActivity)
        buttonGoBackToFirst = findViewById(R.id.buttonGoBackToFirst)

        buttonGoToThirdActivity.setOnClickListener {
            val intentGoToThird = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intentGoToThird)
        }

        buttonGoBackToFirst.setOnClickListener{
            val intentGoBackToFirst = Intent(this@SecondActivity, FirstActivity::class.java)
            startActivity(intentGoBackToFirst)
        }
    }
}
   /* override fun onStart() {
        super.onStart()
        Log.d(TAG, "SecondActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SecondActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "SecondActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "SecondActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SecondActivity onDestroy")
    }
}
*/