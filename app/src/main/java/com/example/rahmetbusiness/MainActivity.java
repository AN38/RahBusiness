package com.example.rahmetbusiness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signUpBtn;
    EditText hint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        signUpBtn = findViewById(R.id.sign_up_btn);
        hint = findViewById(R.id.tvPhoneInformation);
        Log.v("Start screen", "onCreate 2");
        if(savedInstanceState != null) {
            String editText = savedInstanceState.getString("TextUser");
            Toast.makeText(MainActivity.this, editText, Toast.LENGTH_LONG).show();
        }

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewshechka) {
                Log.i("Click Sign Up", "clik");
                String editText = hint.getText().toString();
                Toast.makeText(MainActivity.this,editText,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, Auth.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String textUser = hint.getText().toString();
        outState.putString("TextUser", textUser);
    }

    @Override
    protected void onStart() {
        Log.v("Start screen", "onStart start 2");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("Start screen", "onResume start 2");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v("Start screen", "onPause start 2");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("Start screen", "onStop start 2");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.v("Start screen", "onRestart start 2");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.v("Start screen", "onDestroy start 2");
        super.onDestroy();
    }

}
