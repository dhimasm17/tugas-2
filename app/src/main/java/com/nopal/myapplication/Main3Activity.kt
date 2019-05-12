package com.nopal.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        ambildata()
    }


    private fun ambildata (){
        val bundle = intent.extras

        val username = bundle?.getString("username" )

        txtUsername.text = username



    }
}