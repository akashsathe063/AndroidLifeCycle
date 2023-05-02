package com.udemy.applicationlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this,"second activity onCreate call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onCreate call")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"second activity onStop call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onStop call")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"second activity onPause call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onPause call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"second activity onDestroy call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onDestroy call")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"second activity onRestart call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onRestart call")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"second activity onResume call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onResume call")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"second activity onStart call", Toast.LENGTH_SHORT).show()
        Log.d("message","second activity onStart call")
    }
}