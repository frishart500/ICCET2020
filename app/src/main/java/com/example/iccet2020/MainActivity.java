package com.example.iccet2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton signinBnt;
    private MaterialButton registrationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        signinBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на LoginActivity (окно с входом)
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        registrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Здесь код перехода на другую активность
            }
        });
    }

    // Инициализация элементов интерфейса
    private void init()
    {
        signinBnt = findViewById(R.id.sign_in);
        registrationBtn = findViewById(R.id.registration);
    }
}