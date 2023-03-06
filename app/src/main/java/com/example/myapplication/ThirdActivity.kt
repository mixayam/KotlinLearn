package com.example.myapplication


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        //Log.d(TAG, "FirstActivity before onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        //Log.d(TAG, "FirstActivity onCreate")
        textView = findViewById(R.id.textView2)
    }
}