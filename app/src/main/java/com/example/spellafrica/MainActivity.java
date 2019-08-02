package com.example.spellafrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Enroll(View view) {
        Button Enroll = findViewById(R.id.na_enroll) ;
        Intent intent = new Intent(this,naEnroll.class);
        startActivity(intent);

    }

    public void Lessons(View view) {
        Button Lessons = findViewById(R.id.na_lessons);
        Intent intent = new Intent(this,lessons.class);
        startActivity(intent);
    }

    public void Info(View view) {
        Button Info = findViewById(R.id.na_info);
        Intent intent = new Intent(this,info.class);
        startActivity(intent);
    }

    public void JoinLive(View view) {
        Button JoinLive = findViewById(R.id.na_joinLive);
        Intent intent = new Intent(this,joinLive.class);
        startActivity(intent);


    }
}
