package com.example.contact_form01;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
EditText t1,t2;
Button b1;
int n1=0;
int n2=0;
int total=0;
int avg=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       EditText name=findViewById(R.id.Name);
       EditText t1=findViewById(R.id.T1);
       EditText t2=findViewById(R.id.T2);
       Button b1=findViewById(R.id.B1);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String n = name.getText().toString();
            int n1 = Integer.parseInt((t1.getText().toString()));
            int n2 = Integer.parseInt((t2.getText().toString()));
             total = n1+n2;
             avg = n1+n2/2;

            Intent i=new Intent(MainActivity.this,SecondActivity.class);

            i.putExtra("Name", String.valueOf(name));
            i.putExtra("Total",total);
            i.putExtra("Avg",avg);
            startActivity(i);

        }
    });


    }
}

