package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

class activity_move_with_object extends AppCompatActivity {
    public static final String EXTRA_PERSON = "ektra_person";
    private TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject = (TextView)findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : "+mPerson.getName()+", Email: "+mPerson.getEmail("academy@dicoding.com")+", Age : "+mPerson.getAge()+",location : "+mPerson.getCity("bandung");
        tvObject.setText(text);
    }
}