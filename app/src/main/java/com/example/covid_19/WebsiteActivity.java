package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebsiteActivity extends AppCompatActivity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        web=findViewById(R.id.webpage);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl("https://www.worldometers.info/coronavirus/country/india/");
        web.setWebChromeClient(new WebChromeClient());
    }

     @Override
    public void onBackPressed() {

      if(web.canGoBack()){
        web.goBack();
        }
      else{
         super.onBackPressed();
        }

    }

}
