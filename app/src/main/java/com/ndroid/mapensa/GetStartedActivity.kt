package com.ndroid.mapensa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.ndroid.mapensa.R

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val getStartBtn: CardView = findViewById(R.id.cvGetStarted)
        getStartBtn.setOnClickListener {
            startActivity(Intent(this,SigninActivity::class.java))
            finish()
        }

    }
}