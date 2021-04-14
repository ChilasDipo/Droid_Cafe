package com.example.droid_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    LinearLayout view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        view = findViewById(R.id.view);
        Intent intent = getIntent();
        ArrayList<String> message = intent.getStringArrayListExtra(MainActivity.EXTRA_MESSAGE);
        for (int i = 0; i < message.size() ; i++) {
            TextView textView = new TextView(OrderActivity.this );
            textView.setText(message.get(i));
            view.addView(textView);
        }


    }


}