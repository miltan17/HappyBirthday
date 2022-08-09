package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happybirthday.databinding.ActivityMainBinding

class MainActivity : DrawerBaseActivity() {
    lateinit var activityMainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        allocateActivityTitle("Home")
    }
}