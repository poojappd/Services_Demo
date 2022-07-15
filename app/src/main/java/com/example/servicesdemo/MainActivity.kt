package com.example.servicesdemo

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //val btn: Button = findViewById<Button>(R.id.button2)
    lateinit var  serviceIntent:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

        Toast.makeText(applicationContext, "Create", Toast.LENGTH_SHORT).show()
        //btn.setOnClickListener()

    }

     fun invokeService(view:View) {
         Log.e(TAG,"DONE Thread id: ${Thread.currentThread().id}")
            serviceIntent = Intent(applicationContext, MyService::class.java)
            startService(serviceIntent)

     }
    fun invokeOneMore(view:View){
        Log.e(TAG, "One more with thread ID: ${Thread.currentThread().id}")
        startService(Intent(applicationContext, AnotherService::class.java))
    }
}