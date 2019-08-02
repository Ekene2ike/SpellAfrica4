package com.example.spellafrica;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class joinLive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_live);

        WebView mWebView = findViewById(R.id.na_webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://spellafrica.org/");


    }
}
