package com.advnmpproj.native160818008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var name = "Wadidaw221"
        var phone = "081524844"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome to repo $name :)", Toast.LENGTH_LONG).show()
        Log.d("val-eve","Yahooo")
    }
}