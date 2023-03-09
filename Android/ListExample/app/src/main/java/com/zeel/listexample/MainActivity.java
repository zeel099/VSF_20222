package com.zeel.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView  actxtView;

    int[] arrNo = new int[]{1,2,3,4,5};
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguages = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("Zeel");
        arrNames.add("Raj");
        arrNames.add("Sojitra");
        arrNames.add("Raman");
        arrNames.add("RamanRaj");
        arrNames.add("Zeel");
        arrNames.add("Raj");
        arrNames.add("Sojitra");
        arrNames.add("Raman");
        arrNames.add("RamanRaj");
        arrNames.add("Zeel");
        arrNames.add("Raj");
        arrNames.add("Sojitra");
        arrNames.add("Raman");
        arrNames.add("RamanRaj");
        arrNames.add("Zeel");
        arrNames.add("Raj");
        arrNames.add("Sojitra");
        arrNames.add("Raman");
        arrNames.add("RamanRaj");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               if(position==0){
                   Toast.makeText(MainActivity.this, "Clicked first item", Toast.LENGTH_SHORT).show();
               }
               else if(position==1){
                   Toast.makeText(MainActivity.this,"Clicked second item",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // SPinner
        arrIds.add("Adhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter Id");
        arrIds.add("Ration Card");
        arrIds.add("Xth score Card");
        arrIds.add("XII th score Card");
        arrIds.add("Driving License Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        //AutoCompleteTextView

        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("C#");
        arrLanguages.add("JAVA");
        arrLanguages.add("PYTHON");
        arrLanguages.add("PHP");

        ArrayAdapter<String> actvAdater = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);
        actxtView.setAdapter(actvAdater);
        actxtView.setThreshold(1);
    }
}