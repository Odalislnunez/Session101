package es.usj.mastertsa.onunez.session101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eighth_a.*

class EighthAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eighth_a)
        btnAboutUs.setOnClickListener { aboutUs() }
    }

    private fun aboutUs() {
        var intent = Intent(this, EighthBActivity::class.java)
        startActivity(intent)
    }
}
