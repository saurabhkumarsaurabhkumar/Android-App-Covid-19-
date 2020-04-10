package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {

    private EditText e1,e2,e3;
    private ImageButton b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.subject);
        e3=findViewById(R.id.Message);

        b2=findViewById(R.id.imageButton);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sendmail();
            }
        });

    }

    public void Sendmail(){
        String r1=e1.getText().toString();
        String [] r2=r1.split(",");

        String s1=e2.getText().toString();
        String m1=e3.getText().toString();


        Intent i=new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,r2);

        i.putExtra(Intent.EXTRA_SUBJECT,s1);
        i.putExtra(Intent.EXTRA_TEXT,m1);

        i.setType("m1/rfc822");
        startActivity(Intent.createChooser(i,"Choose an email client"));

    }




}
