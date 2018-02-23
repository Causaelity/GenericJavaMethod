package com.android.generic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private <T> void displayGeneric(T type) {
        TextView quantityTextView = findViewById(R.id.text_view);
        quantityTextView.setText("" + type);
    }

    public void stringDisplay(View v) {
        String string = "This is a string";
        displayGeneric(string);
    }

    public void intDisplay(View v) {
        int intNumber = 32;
        displayGeneric(intNumber);
    }

    public void doubleDisplay(View v) {
        double doubleNumber = 3.1415926;
        displayGeneric(doubleNumber);
    }



}
