package com.example.sort_othod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick1(view: View) {
        val intent= Intent (this, ActivitySort::class.java)
        startActivity(intent)
    }

    fun onClick2(view: View) {
        val intent= Intent (this, ActivitySort2::class.java)
        startActivity(intent)
    }

    fun onClick3(view: View) {
        val intent= Intent (this, ActivitySort3::class.java)
        startActivity(intent)
    }
}