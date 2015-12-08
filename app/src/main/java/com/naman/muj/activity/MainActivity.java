package com.naman.muj.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.naman.muj.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String jsonData = intent.getStringExtra("data");
        String title = intent.getStringExtra("title");
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
    }
}
