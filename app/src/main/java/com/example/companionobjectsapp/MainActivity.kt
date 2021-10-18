package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var et:EditText
    lateinit var button: Button
    lateinit var conlay:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        conlay=findViewById(R.id.conlay)
        et=findViewById(R.id.et)
        button=findViewById(R.id.button)

        button.setOnClickListener {
            val str=et.text.toString().capitalize()
            change(str)
            et.text.clear()
        }
    }

    fun change(input:String){
        if (input== changebackground.d){
            conlay.setBackgroundResource(R.drawable.day2)
        }else if(input== changebackground.n){
            conlay.setBackgroundResource(R.drawable.night2)

        }
    }
}