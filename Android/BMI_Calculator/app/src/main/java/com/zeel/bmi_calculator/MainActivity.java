package com.zeel.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtweight,edtheightFt,edtheightIn;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout LIMain;

        edtweight = findViewById(R.id.edtWeight);
        edtheightFt = findViewById(R.id.edtHeightFt);
        edtheightIn = findViewById(R.id.edtHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        LIMain = findViewById(R.id.LIMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtweight.getText().toString()) ;
                int ft = Integer.parseInt(edtheightFt.getText().toString());
                int in = Integer.parseInt(edtheightIn.getText().toString());

                int totalIn = ft*12 + in;
                double totalCM = totalIn*2.53;
                double totalM = totalCM/100;

                double BMI = wt/(totalM*totalM*totalM);

                if(BMI>25){
                    txtResult.setText("Result is overweight");
                    LIMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
                }else if(BMI<18){
                    txtResult.setText("Result is Underweight");
                    LIMain.setBackgroundColor(getResources().getColor(R.color.colorUW));
                }else{
                    txtResult.setText("Result is helthy");
                    LIMain.setBackgroundColor(getResources().getColor(R.color.colorHW));
                }
            }
        });
    }
}