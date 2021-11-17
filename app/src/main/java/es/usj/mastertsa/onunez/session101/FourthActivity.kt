package es.usj.mastertsa.onunez.session101

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        spOperations.adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_dropdown_item,
            Operation.values().map { it.name })

        btnExecute.setOnClickListener { execute () }
    }

    @SuppressLint("SetTextI18n")
    private fun execute () {
        val firstValue = etFirstV.toDouble()
        val secondValue = etSecondV.toDouble()

        val result: Double = when(Operation.valueOf(spOperations.selectedItem.toString())) {
            Operation.ADD -> firstValue + secondValue
            Operation.SUBTRACT -> firstValue - secondValue
            Operation.MULTIPLY -> firstValue * secondValue
            Operation.DIVIDE -> firstValue / secondValue
        }

        tvResult.text = "The result is: {$result}"
    }
}

private fun EditText.toDouble(): Double = if(text.isNullOrEmpty()) 0.0 else text.toString().toDouble()

enum class Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}