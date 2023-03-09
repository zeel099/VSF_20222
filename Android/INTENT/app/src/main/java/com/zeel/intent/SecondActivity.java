package com.zeel.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//         {


                Intent fromAct = getIntent();
                String title = fromAct.getStringExtra("title");
                String studentname = fromAct.getStringExtra("StudentName");
                int rollNo = fromAct.getIntExtra("Roll no",0);

                TextView textStudentInfo;

                textStudentInfo= findViewById(R.id.textStudentInfo);

                textStudentInfo.setText("RollNo:"+rollNo+",Name:"+ studentname);
                getSupportActionBar().setTitle(title);


                Button btnPrev;

              btnPrev = findViewById(R.id.btnPrev);

               btnPrev.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent iPrev;
                       iPrev = new Intent(SecondActivity.this,MainActivity.class);
                       startActivity(iPrev);
                   }
               });


    }
}