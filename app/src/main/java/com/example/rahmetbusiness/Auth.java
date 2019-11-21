package com.example.rahmetbusiness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Auth extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Start screen", "onCreate start");
        setContentView(R.layout.auth);
//        Toast.makeText(this, , Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onStart() {
        Log.v("Start screen", "onStart start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("Start screen", "onResume start");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v("Start screen", "onPause start");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("Start screen", "onStop start");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.v("Start screen", "onRestart start");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.v("Start screen", "onDestroy start");
        super.onDestroy();
    }
}
