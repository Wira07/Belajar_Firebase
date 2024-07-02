package com.example.projectjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    FirebaseAuth mAuth;
    public CardView c1, c2, c3, c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CardView) findViewById(R.id.c1tutorial);
        c2 = (CardView) findViewById(R.id.c2interview);
        c3 = (CardView) findViewById(R.id.c3quiz);
        c4 = (CardView) findViewById(R.id.c3video);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);


        mAuth = FirebaseAuth.getInstance();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu1) {
        getMenuInflater().inflate(R.menu.menu,menu1);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i;
        switch (item.getItemId()){
            case R.id.profile:
                i = new Intent(this, profile.class);
                startActivity(i);
                break;


            case R.id.aboutus:
                i = new Intent(this, aboutus.class);
                startActivity(i);
                break;


            case R.id.logout1:
                mAuth.signOut();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.c1tutorial:
                i = new Intent(this, javatutorial.class);
                startActivity(i);
                break;

            case R.id.c2interview:
                i = new Intent(this, javainterview.class);
                startActivity(i);
                break;
            case R.id.c3quiz:
                i = new Intent(this, javaquiz.class);
                startActivity(i);
                break;
            case R.id.c3video:
                i = new Intent(this, javavideos.class);
                startActivity(i);
                break;

        }
    }
}