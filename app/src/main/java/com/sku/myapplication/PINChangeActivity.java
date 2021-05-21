package com.sku.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PINChangeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pin_change);

        TextView textView = (TextView) findViewById(R.id.text);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("TEXT"));

    }
}
