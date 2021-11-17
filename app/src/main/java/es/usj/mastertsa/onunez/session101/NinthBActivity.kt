package es.usj.mastertsa.onunez.session101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ninth_b.*

class NinthBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth_b)
        val url = intent.getStringExtra(URL)
        wvUrl.webViewClient = WebViewClient()
        if (url != null) {
            wvUrl.loadUrl(url)
        }
    }
}