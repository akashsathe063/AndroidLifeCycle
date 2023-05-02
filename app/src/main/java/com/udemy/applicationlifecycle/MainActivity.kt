package com.udemy.applicationlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var button1 : Button
    lateinit var button2 : Button

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"first activity onCreate call",Toast.LENGTH_SHORT).show()
        Log.d("message"," first activity onCreate call")

        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {
            counter = counter + 1

            textView.text = "" + counter
        }

        button2.setOnClickListener {
            val intent = Intent(this@MainActivity,SecondActivity::class.java)

            startActivity(intent)

        }
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"first activity onStop call",Toast.LENGTH_SHORT).show()
        Log.d("message","first activity onStop call")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"first activity onPause call",Toast.LENGTH_SHORT).show()
        Log.d("message","first activity onPause call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"first activity onDestroy call",Toast.LENGTH_SHORT).show()
        Log.d("message","first activity onDestroy call")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"first activity onRestart call",Toast.LENGTH_SHORT).show()
        Log.d("message","first activity onRestart call")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"first activity onResume call",Toast.LENGTH_SHORT).show()
        Log.d("message","first activity onResume call")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"first activity onStart call",Toast.LENGTH_SHORT).show()
        Log.d("message","first activity onStart call")
    }
}