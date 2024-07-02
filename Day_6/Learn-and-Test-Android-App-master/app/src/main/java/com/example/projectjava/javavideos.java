package com.example.projectjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class javavideos extends AppCompatActivity {
TextView v1,v2,v3,v4,v5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javavideos);
        TextView v1=findViewById(R.id.v1);
        TextView v2=findViewById(R.id.v2);
        TextView v3=findViewById(R.id.v3);
        TextView v4=findViewById(R.id.v4);
        TextView v5=findViewById(R.id.v5);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q"));
                startActivity(intent);
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop"));
                startActivity(intent);
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtube.com/playlist?list=PLlhM4lkb2sEhfuXL-2BDrJ67WkUdQ2v9b"));
                startActivity(intent);
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtube.com/playlist?list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5"));
                startActivity(intent);
            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ"));
                startActivity(intent);
            }
        });



    }
}