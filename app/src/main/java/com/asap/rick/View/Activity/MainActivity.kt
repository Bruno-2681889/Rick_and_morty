package com.asap.rick.View.Activity

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import com.asap.rick.R
import androidx.core.app.ActivityOptionsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        val menuButton = findViewById<Button>(R.id.inic)
        menuButton.setOnClickListener {
            val intent = Intent(this, MainActivity_menu::class.java)
            val ActivityOptionsCompat =
                ActivityOptionsCompat.makeCustomAnimation(applicationContext,R.anim.fade_in,R.anim.mover_dir);
                ActivityCompat.startActivity(this,intent, ActivityOptionsCompat.toBundle())
           startActivity(intent)
        }

        val menuButton2 = findViewById<Button>(R.id.inic2)
        menuButton2.setOnClickListener {
            val intent = Intent(this, MainActivity_menu::class.java)
            startActivity(intent)
        }

    val img = findViewById<ImageView>(R.id.image_menu)
        img.setOnClickListener {
            val intent = Intent(this, MainActivity_menu::class.java)
            startActivity(intent)
        }
    }
}