package es.usj.mastertsa.onunez.session101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sixth.*

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)
        ibPhone.setOnClickListener { call() }
    }
    private fun call() {
        tvAction.text = "Calling..."
    }

}