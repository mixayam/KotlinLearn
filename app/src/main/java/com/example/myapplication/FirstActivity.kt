package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val TAG = "Vadim"
class FirstActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var buttonGoToSecondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "FirstActivity before onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.d(TAG, "FirstActivity onCreate")
        editText = findViewById(R.id.editText)
        buttonGoToSecondActivity = findViewById(R.id.buttonGoToSecondActivity)

        buttonGoToSecondActivity.setOnClickListener {
            val intentGoToSecond = Intent(this@FirstActivity, SecondActivity::class.java)
            intentGoToSecond.putExtra(KEY_ENTERED_TEXT, editText.text.toString())
            intentGoToSecond.putExtra("key", 123)
            startActivity(intentGoToSecond)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "FirstActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "FirstActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "FirstActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "FirstActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "FirstActivity onDestroy")
    }

}