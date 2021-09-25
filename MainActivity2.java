package com.example.contact_form01;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        //intent to get data
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        int total=getIntent().getIntExtra("Total",0);
        int avg=getIntent().getIntExtra("Avg",0);

        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+name+"\n" +
                          "Avg: "+total+"\n"+
                      "Tot: "+avg+"\n");

    }
}