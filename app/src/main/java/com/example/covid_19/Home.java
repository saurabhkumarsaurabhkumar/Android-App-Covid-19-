package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    private ImageButton imgbtnsite,imgbtnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imgbtnsite=findViewById(R.id.site);

        imgbtnsend=findViewById(R.id.contact);



        imgbtnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicksend();
            }
        });




        imgbtnsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Covidsite();
            }
        });

    }
    public  void Covidsite(){
        Intent intent=new Intent(this,WebsiteActivity.class);
        startActivity(intent);
    }

    public void  clicksend(){

        Intent intent=new Intent(this,ContactActivity.class);
        startActivity(intent);
    }






}
