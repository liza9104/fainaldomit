package com.cookandroid.fainaldomit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mypageActivity extends AppCompatActivity {

    TextView profile, logcheck;
    EditText editTextTextPersonName, editTextTextEmailAddress;
    Button profilefix;
    ScrollView boardcont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage2);



    }
}