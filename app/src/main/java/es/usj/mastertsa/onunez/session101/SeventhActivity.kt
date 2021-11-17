package es.usj.mastertsa.onunez.session101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_seventh.*
import kotlin.random.Random

class SeventhActivity : AppCompatActivity() {
    var randomValue : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)
        randomValue = Random.nextInt(0, 100000)
        Toast.makeText(this, "$randomValue", Toast.LENGTH_SHORT).show()
        btnCheck.setOnClickListener { check() }
    }

    private fun check() {
        var message = ""
        message = if(randomValue == etNumber.toInt())
            "Excellent, you remembered the number!"
        else "Sorry, you forgot the number!"

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}