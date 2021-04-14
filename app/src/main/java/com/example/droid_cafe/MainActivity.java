package com.example.droid_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.droidcafe.extra.MESSAGE";
    ArrayList<String> OrderList = new ArrayList<>();
    String sendmessege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, OrderList);
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast toast = Toast.makeText(MainActivity.this, message,
                Toast.LENGTH_SHORT);
        OrderList.add(message + " has been ordered");
        toast.show();
    }
    public void showDonutOrder(View view) {
        displayToast(getString(R.string.donutorder));
    }

    public void showIceCreamOrder(View view) {
        displayToast(getString(R.string.icecreamorder));
    }

    public void showFroyoOrder(View view) {
        displayToast(getString(R.string.froyoorder));
    }
}