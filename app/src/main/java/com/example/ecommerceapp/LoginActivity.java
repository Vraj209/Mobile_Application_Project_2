package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void signup(View view){
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }
    public void signin(View view){
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
    }
}