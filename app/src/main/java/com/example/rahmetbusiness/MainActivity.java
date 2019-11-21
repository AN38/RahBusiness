package com.example.rahmetbusiness;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLogIn;
    private EditText etSignupLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLogIn = findViewById(R.id.log_in_btn);
        etSignupLogin = findViewById(R.id.signup_login);

        btnLogIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.i("myOnClick", "click");
                String textInET = etSignupLogin.getText().toString();
                Toast.makeText(MainActivity.this, textInET, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
