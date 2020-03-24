package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView getstartedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"Welcome", Toast.LENGTH_SHORT).show();
        getstartedButton=(ImageView)findViewById(R.id.getstartedButtonId);
        getstartedButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent loginIntent = new Intent(MainActivity.this, secondpage.class);
        startActivity(loginIntent);
    }

}
