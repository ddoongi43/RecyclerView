package com.sku.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PatternChangeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pattern_change);

        TextView textView = (TextView) findViewById(R.id.text1);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("TEXT"));

    }
}
