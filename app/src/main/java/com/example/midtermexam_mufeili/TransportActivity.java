package com.example.midtermexam_mufeili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TransportActivity extends AppCompatActivity {

    Button btnReturn;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        initialize();

    }
    private  void  initialize()
    {
        btnReturn = findViewById(R.id.btnReturn);

    }
}