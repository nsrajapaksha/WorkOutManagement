package com.example.powerwomennewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutList extends AppCompatActivity {
    Button view_btn1;
    Button view_btn2;
    Button view_btn3;
    Button view_btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_list);

        view_btn1 =(Button)findViewById(R.id.view_btn1);
        view_btn2 =(Button)findViewById(R.id.view_btn2);
        view_btn3 =(Button)findViewById(R.id.view_btn3);
        view_btn4 =(Button)findViewById(R.id.view_btn4);


        view_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutList.this, View1.class);
                startActivity(intent);
            }
        });

        view_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutList.this, View2.class);
                startActivity(intent);
            }
        });

        view_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutList.this, View3.class);
                startActivity(intent);
            }
        });

        view_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkoutList.this, View4.class);
                startActivity(intent);
            }
        });

    }
}
