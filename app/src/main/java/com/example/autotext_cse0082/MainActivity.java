package com.example.autotext_cse0082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView auto1;
    EditText ed1,ed2;
    Button btn1;
    String [] locations = {"Bangalore","Delhi","Bhopal","Pune","Hyderabad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto1  = findViewById(R.id.auto1);
        ed1    = findViewById(R.id.ed1);
        ed2    = findViewById(R.id.ed2);
        btn1   = findViewById(R.id.btn1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,locations);
        auto1.setThreshold(1);
        auto1.setAdapter(arrayAdapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed1.getText().toString();
                String lastname = ed2.getText().toString();
                String place = auto1.getText().toString();
                String res = "My personal Deatails : "+name+" "+lastname+" "+place;
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();


            }
        });
    }
}