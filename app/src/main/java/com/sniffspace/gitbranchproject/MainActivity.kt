package com.sniffspace.gitbranchproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun masterFunction() {
        // comment for master
    }

    fun devOne() {
        //create dev one
        // commit in second in dev_one
        // third commit in dev_one
        // forth commit in dev_one
    }
}