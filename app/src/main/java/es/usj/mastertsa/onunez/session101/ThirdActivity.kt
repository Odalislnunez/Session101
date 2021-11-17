package es.usj.mastertsa.onunez.session101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnExecute.setOnClickListener { execute() }
    }

    private fun execute () {
        var result = ""
        if(cbPlus.isChecked) result += "The addition result is: " + "${etFirstV.toInt() + etSecondV.toInt()}\n"
        if(cbMinus.isChecked) result += "The subtraction result is: " + "${etFirstV.toInt() - etSecondV.toInt()}\n"
        if(!cbPlus.isChecked && !cbMinus.isChecked) result += "You have to select at least an operation."
        tvResult.text = result
    }
}