package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button= findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            Toast.makeText(this,"Rolling...",Toast.LENGTH_SHORT).show()
          rollDice()
        }
   
        img = findViewById(R.id.roll_img)

    }
    private fun rollDice() {
        val r = Random().nextInt(6)+1
       val result =  when(r){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(result)

    }


}
