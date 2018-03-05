package com.example.fwu.breakpoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {


    private static final String TAG1 = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG1, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG1, "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG1, "onPause: ");
    }


}
