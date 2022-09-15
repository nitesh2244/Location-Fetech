package com.example.locationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.location.LocationManager;
import android.os.Bundle;

import com.example.locationapp.databinding.ActivityCurrentLocationBinding;
import com.example.locationapp.databinding.ActivityMainBinding;

public class CurrentLocation extends AppCompatActivity {
    ActivityCurrentLocationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_current_location);



    }
}