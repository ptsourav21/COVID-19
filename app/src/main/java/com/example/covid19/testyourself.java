package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class testyourself extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    ImageView test;
    TextView N, A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testyourself);
        c1 = (CheckBox) findViewById(R.id.checkBox1);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        c5 = (CheckBox) findViewById(R.id.checkBox5);
        c6 = (CheckBox) findViewById(R.id.checkBox6);
        c7 = (CheckBox) findViewById(R.id.checkBox7);
        c8 = (CheckBox) findViewById(R.id.checkBox8);
        N=(TextView)findViewById(R.id.nameShowId);
        A=(TextView)findViewById(R.id.ageShowId);

        Intent intent=getIntent();

            N.setText(intent.getStringExtra("n"));
            A.setText(intent.getStringExtra("a"));

        test = (ImageView) findViewById(R.id.testId);
        test.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int r = 0;

        if (c1.isChecked()) {
            r = r + 1;
        } if (c2.isChecked())
        {
            r = r + 1;
        } if (c3.isChecked()) {
            r = r + 1;
        } if (c4.isChecked()) {
            r = r + 1;
        } if (c5.isChecked()) {
            r = r + 1;
        }
         if (c6.isChecked()) {
            r = r + 1;
        }  if (c7.isChecked()) {
            r = r + 1;
        } if (c8.isChecked()) {
            r = r + 1;
        }

        if (r <= 3) {
            Toast.makeText(testyourself.this, "You Have Normal Flu", Toast.LENGTH_SHORT).show();
        }  if (r >= 4 && r <= 6) {
            Toast.makeText(testyourself.this, "You Have Symtomps Of COVID-19", Toast.LENGTH_SHORT).show();
        }
        if(r>6)
            Toast.makeText(testyourself.this, "You Are Affected", Toast.LENGTH_SHORT).show();
    }
}
