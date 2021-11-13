package com.neppplus.kotlingrammar_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {

//            이 안에 적는 코드 - 변수 문법 연습 01

            var myName : String

            myName = "조경진"
            myName = "김경진"

            Log.d("문법연습01",  myName)

            val friendName : String
            friendName = "김갑생"
//            friendName = "김친구"

            Log.d("문법연습01", friendName)

        }

        btnVariable02.setOnClickListener {

//            변수 연습 02

            var myName = "조경진"
            val myBirthYear = 1988
            var myHeight = 185.5

            myHeight = 180.2

            Log.d("변수연습02", myName)

        }

    }
}