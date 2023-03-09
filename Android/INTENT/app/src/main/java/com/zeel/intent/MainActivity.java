package com.zeel.intent;

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

        Button btnNext;

        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext;
                iNext = new Intent(MainActivity.this,SecondActivity.class);
                iNext.putExtra("title","Home");
                iNext.putExtra("StudentName","ZEEL");
                iNext.putExtra("Roll no",10);

                startActivity(iNext);


            }
        });
    }
}