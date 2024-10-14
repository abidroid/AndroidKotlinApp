package dev.intellilogics.androidkotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculatorActivity : AppCompatActivity() {

    lateinit var edOne: EditText
    lateinit var edTWo: EditText
    lateinit var tvResult: TextView
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMul: Button
    lateinit var btnDiv: Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContentView(R.layout.activity_caculator)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edOne = findViewById(R.id.ed_one)
        edTWo = findViewById(R.id.ed_two)
        tvResult = findViewById(R.id.tv_result)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMul = findViewById(R.id.btn_mul)
        btnDiv = findViewById(R.id.btn_divide)

       btnAdd.setOnClickListener{
           val one = edOne.text.toString().toInt()
           val two = edTWo.text.toString().toInt()
           val result = one + two
           tvResult.text = result.toString()
       }
    }
}