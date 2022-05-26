package com.example.powerwomennewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home2 extends AppCompatActivity {
     Button home_btn2;
     Button home_btn3;
     Button home_btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        home_btn2 =(Button)findViewById(R.id.home_btn2);
        home_btn3 =(Button)findViewById(R.id.home_btn3);
        home_btn1 =(Button)findViewById(R.id.home_btn1);


        home_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2.this, MyWorkout.class);
                startActivity(intent);
            }
        });

        home_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2.this, WeightConverter.class);
                startActivity(intent);
            }
        });

        home_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2.this, WorkoutList.class);
                startActivity(intent);
            }
        });

    }
}
