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

        btnCondition01.setOnClickListener {
//            조건문 01 버튼 눌리면 실행될 코드

            val userAge = 10

//            나이가 20살 이상인가? -> 로그로 "성인입니다." 문장 출력
            if (userAge >= 20) {

                Log.d("조건문01", "성인입니다.")

            }
            else if (userAge >= 17) {

//                성인이 아니고, 질문 -> 17살이상인가?
                Log.d("조건문01", "고등학생입니다.")

            }
            else if (userAge >= 14) {
//                성인이 아니고, 고등학생 도 아닐때 질문 -> 14살 이상인가?
                Log.d("조건문01", "중학생입니다.")
            }
            else {
                Log.d("조건문01", "초등학생이거나, 미취학아동입니다.")
            }

        }

        btnCondition02.setOnClickListener {

//            논리 연산자 체험

//            고연봉,  가까운거리,  야근없음

//            A회사의 조건
            val companyASalary = 3000
            val companyADistance = 50
            val compnayAWorkEasy = true

//            1번 구직자는 취업 의사?
//            조건 : 연봉 4천 이상이면 OK
            val person01OK =  companyASalary >= 4000

            Log.d("조건문02", person01OK.toString())

//            2번 구직자
//            조건 :  이동시간이 30분 이내 or 빨리 퇴근
            val person02Ok =  (companyADistance <= 30) || compnayAWorkEasy

//            Bool변수 "== true"는 할 필요가 없는 질문.
//            Bool변수 안에 있는 값을 그대로 꺼내 쓰면, == true와 항상 같은 결과.

            Log.d("조건문02", person02Ok.toString())


//            3번 구직자
//            조건 : 빨리 퇴근안하는 회사 -> NOT 연산

            val person03Ok =  !compnayAWorkEasy
            Log.d("조건문02", person03Ok.toString())

        }

    }
}