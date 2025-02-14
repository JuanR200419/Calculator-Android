package com.example.calculator

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

   var  tn1:EditText?=null
    var  tn2:EditText?=null
    var tvr:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tn1= findViewById(R.id.txtNumber)
        tn2 = findViewById(R.id.txtNumber2)
        tvr = findViewById(R.id.textViewResult)



    }

    fun sum(view: android.view.View) {
        val n1 = tn1?.text.toString().toInt()
        val n2 = tn2?.text.toString().toInt()
        val result = n1 + n2
        tvr?.text = result.toString()
    }

    fun division(view: android.view.View) {
        val n1 = tn1?.text.toString().toInt()
        val n2 = tn2?.text.toString().toInt()
        val result = n1 / n2
        tvr?.text = result.toString()
    }

    fun multiplication(view: android.view.View) {
        val n1 = tn1?.text.toString().toInt()
        val n2 = tn2?.text.toString().toInt()
        val result = n1 * n2
        tvr?.text = result.toString()
    }

    fun rest(view: android.view.View) {
        val n1 = tn1?.text.toString().toInt()
        val n2 = tn2?.text.toString().toInt()
        val result = n1 - n2
        tvr?.text = result.toString()
    }
}