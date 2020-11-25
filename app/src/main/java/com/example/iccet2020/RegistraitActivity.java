package com.example.iccet2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistraitActivity extends AppCompatActivity {

    private EditText surname, name, name_of_father, data, snils, email, password, phone, polis, polis_number;
    private Button registration_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrait);

        init();//вызов метода

    }

    //иницилизация

    private void init(){
        surname = findViewById(R.id.surname);
        name = findViewById(R.id.name);
        name_of_father = findViewById(R.id.name_of_father);
        data = findViewById(R.id.data);
        snils = findViewById(R.id.snils);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        polis = findViewById(R.id.polis);
        polis_number = findViewById(R.id.polis_number);

        registration_btn = findViewById(R.id.registration_btn);
    }
}