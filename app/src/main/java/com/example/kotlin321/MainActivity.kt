package com.example.kotlin321

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var result: TextView
    private lateinit var clear: TextView
    private var operand = 0.0
    private var operation = ""

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result = findViewById(R.id.result)
        clear = findViewById(R.id.clear)
    }

    fun numclick(clickedView: View) {
        if (clickedView is TextView) {
            val number = result.text.toString()
            var text = clickedView.text.toString()
            if (number == "0.0") {
                val result1 = text
                result.text =result1
            } else {
                val result1 = number+text
                result.text =result1
            }
            if (number=="0"){
                if (text=="0"){
                    result.text=number
                }else{
                    number==number+text
                }
            }

        }
    }

    fun clickoperand(clickedView: View) {
        if (clickedView is TextView) {
            operand = result.text.toString().toDouble()
            operation = clickedView.text.toString()
            result.text = ""
        }
    }

    fun clearall(clickedView: View) {
        if (clickedView is TextView) {
            val clearing=clickedView.text.toString()
                result.text = ("0.0")
            }
        }


    fun delete(clickedView: View) {
        if (clickedView is TextView) {
            val deleting=clickedView.text.toString()
            if (deleting=="DEL") {
                if (result.text.length==1 || result.text=="0.0") {
                    result.text="0.0"
                } else{
                    result.text = result.text.dropLast(1)
                }
                }

             }

            }



    fun decimal(clickedView: View) {
        val number1:TextView=findViewById(R.id.result)
        if (clickedView is TextView) {
            var dot=clickedView.text.toString()
            if (result.text.contains('.')) {
                result.text = result.text
            } else {
                result.text = result.text.toString() + '.'.toString()
            }
            if (number1.text.contains('.')  ){
                if ( clickedView.text=="."){
                    result.text=number1.text
                }else{
                    result.text=clickedView.text
                }
            }

        }
    }

    fun equalsclick(clickedView: View) {
        if (clickedView is TextView) {
            val operand2 = result.text.toString().toDouble()

            when (operation) {

                    "-" -> result.text = (operand - operand2).toString()
                "+" -> result.text = (operand + operand2).toString()
                "/" -> result.text = (operand / operand2).toString()
                "X" -> result.text = (operand * operand2).toString()

            }
            if(result.text.endsWith(".0")){
                result.text=result.text.dropLast(2).toString()
        }
            if(result.text.endsWith("0") && result.text.contains('.')){
                result.text=result.text.dropLast(1).toString()
            }


           }
        }
    }







