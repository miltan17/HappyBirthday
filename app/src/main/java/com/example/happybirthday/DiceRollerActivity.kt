package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.happybirthday.databinding.ActivityDiceRollerBinding

class DiceRollerActivity : DrawerBaseActivity() {

    lateinit var activityMainBinding: ActivityDiceRollerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityDiceRollerBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_dice_roller)
        setContentView(activityMainBinding.root)
        allocateActivityTitle("Dice Roller")

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener{
            diceRoll()
        }
    }


    private fun diceRoll(){
        val dice = Dice(6)
        val randomNumberTextView: TextView = findViewById(R.id.randomNoTextView)
        randomNumberTextView.text = dice.roll().toString()
    }
}


class Dice(val slides: Int){
    fun roll(): Int{
        return (1..slides).random()
    }
}