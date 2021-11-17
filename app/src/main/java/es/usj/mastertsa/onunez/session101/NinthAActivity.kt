package es.usj.mastertsa.onunez.session101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ninth_a.*

const val URL = "url"

class NinthAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth_a)
        btnVisit.setOnClickListener { visit() }
    }

    private fun visit() {
        if (!etUrl.text.toString().isNullOrEmpty()) {
            val intent = Intent(this, NinthBActivity::class.java)
            intent.putExtra(URL, etUrl.text.toString())
            startActivity(intent)
        }
        else
            Toast.makeText(this, "INSERT A VALID URL.", Toast.LENGTH_LONG).show()
    }
}