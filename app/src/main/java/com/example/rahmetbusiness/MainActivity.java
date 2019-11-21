package com.example.rahmetbusiness;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Log.i("myMainActivity", "onCreate");
        if(savedInstanceState != null) {
            String str = savedInstanceState.getString("USER_TEXT");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }

        editText = findViewById(R.id.et);

        LinearLayout btnNext = findViewById(R.id.llGoNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                intent.putExtra("str1", editText.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String userText = editText.getText().toString();
        outState.putString("USER_TEXT", userText);
    }

    @Override
    protected void onStart() {
        Log.i("myMainActivity", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("myMainActivity", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("myMainActivity", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("myMainActivity", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("myMainActivity", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.i("myMainActivity", "onRestart");
        super.onRestart();
    }
}
