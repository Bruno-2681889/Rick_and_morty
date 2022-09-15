package com.asap.rick.View.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.asap.rick.R

class MainActivity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar!!.hide()

        val psg: Button = findViewById<Button>(R.id.buttonPersonagens)
        psg.setOnClickListener {
            val intent = Intent(this, MainActivity_personagens::class.java)
            startActivity(intent)
        }

        val lcl = findViewById<Button>(R.id.buttonLocal)
        lcl.setOnClickListener {
            val intent = Intent(this, MainActivity_Localizacao::class.java)
            startActivity(intent)
        }

        val epi = findViewById<Button>(R.id.buttonEpisodios)
        epi.setOnClickListener {
            val intent = Intent(this, MainActivity_Episodios::class.java)
            startActivity(intent)
        }
        }
}