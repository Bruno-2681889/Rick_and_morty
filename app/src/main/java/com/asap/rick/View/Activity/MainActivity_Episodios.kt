package com.asap.rick.View.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asap.rick.R

class MainActivity_Episodios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_episodios)
        supportActionBar!!.hide()

    }
}