package com.example.kaconk.controller;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);


    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, mShowCount.getText(), Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }


    public void countDown(View view) {

        if (mCount != 0 ) {
            mCount--;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount));
        } else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context,R.string.toast_zero, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void resetnumber(View view) {
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
    }
}
