package es.usj.mastertsa.onunez.session101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnExecute.setOnClickListener {  execute() }
    }

    private fun execute() {
        when(rbAddition.isChecked) {
            true -> tvResult.text = "${etFirstV.toInt() + etSecondV.toInt()}"
            false -> tvResult.text = "${etFirstV.toInt() - etSecondV.toInt()}"
        }
    }
}