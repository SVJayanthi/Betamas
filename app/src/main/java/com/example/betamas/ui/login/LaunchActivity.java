package com.example.betamas.ui.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.betamas.R;

public class LaunchActivity  extends AppCompatActivity {
    //Set up references for objects
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Make sure this is before calling super.onCreate
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, LoginActivity.class));
    }
}
