package com.example.schoolintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void onClick(View v) {
        int edit1 = Integer.parseInt(binding.edit1.getText().toString());
        int edit2 = Integer.parseInt(binding.edit2.getText().toString());
        int num=edit1+edit2;
        Intent intent=new Intent(MainActivity.this,ActivitySecond.class);
        intent.putExtra("num",num);
        startActivity(intent);
    }

}