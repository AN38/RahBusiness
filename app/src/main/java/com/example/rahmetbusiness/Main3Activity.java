package com.example.rahmetbusiness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle intent = getIntent().getExtras();
        if(intent != null) {
            String receivedStr = intent.getString("str1");
            Toast.makeText(this, receivedStr, Toast.LENGTH_LONG).show();
        }
        Log.i("myMainActivity", " ------ onCreate");
    }

    @Override
    protected void onStart() {
        Log.i("myMainActivity", " ------ onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("myMainActivity", " ------ onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("myMainActivity", " ------ onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("myMainActivity", " ------ onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("myMainActivity", " ------ onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.i("myMainActivity", " ------ onRestart");
        super.onRestart();
    }
}
