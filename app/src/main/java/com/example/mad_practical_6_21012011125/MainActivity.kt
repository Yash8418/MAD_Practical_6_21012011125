package com.example.mad_practical_6_21012011125

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val play: FloatingActionButton = findViewById(R.id.floatingActionButton2)
        val play=findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        //val stop: FloatingActionButton = findViewById(R.id.floatingActionButton6)
        val stop=findViewById<FloatingActionButton>(R.id.floatingActionButton6)


        play.setOnClickListener{
            playbtn()
            play.setImageDrawable(getDrawable(R.drawable.baseline_stop_24))

        }
        stop.setOnClickListener{
            stopbtn()
        }

    }
    fun playbtn(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply{ startService(this)}
    }
    fun stopbtn(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { stopService(this) }

    }
}

