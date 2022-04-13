package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var totalAndTip: TextView? = null
    private var tipOnly: TextView? = null
    private var percentageTip: EditText? = null
    private var inputCost: EditText? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var calculate: Button = findViewById(R.id.calculate)
        totalAndTip = findViewById(R.id.totalCostPlusTip)
        tipOnly = findViewById(R.id.justTip)
        percentageTip = findViewById(R.id.tipPercentage)
        inputCost = findViewById(R.id.totalCost)


        //Calling Calculate function
        calculate.setOnClickListener{
            calculateTip()

        }




    }



    //calculate function
    fun calculateTip() {
        if(percentageTip?.length() !== 0 && inputCost?.length() !== 0 ){
            val totalWithTip =  ((percentageTip?.text.toString().toDouble()/100) * inputCost?.text.toString().toDouble()) + inputCost?.text.toString().toDouble()
            val tip = (percentageTip?.text.toString().toDouble()/100) * inputCost?.text.toString().toDouble()
            totalAndTip?.setText("Total with tip: $" + "%.02f".format(totalWithTip))
            tipOnly?.setText("Tip: $" + "%.02f".format(tip))




        }


    }
}







