package com.dasharath.googlenewsretrofir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_get_news.*

class GetNews : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_news)

        var url = intent.getStringExtra("url")

        wview.loadUrl(url)
        wview.webViewClient = WebViewClient()
        wview.settings.javaScriptEnabled = true
        wview.settings.builtInZoomControls = true
    }
}
