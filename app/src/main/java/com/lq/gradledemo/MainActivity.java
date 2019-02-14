package com.lq.gradledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lq.lib_test.AA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AA();
    }
}
