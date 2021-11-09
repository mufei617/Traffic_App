package com.example.midtermexam_mufeili;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edUserName,edPassWord;
    Button clickedBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void  initialize()
    {
        edUserName = findViewById(R.id.edPassword);
        edPassWord = findViewById(R.id.edPassword);
    }
/*
    public  void vialidate(View view)
    {
        String username = edUserName.getText().toString();
        String password = edUserName.getText().toString();
        if(username != "admin" || password != "padmin")
        {
            String result = "Wrong username or password.";
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();
        }
        else if (username == "admin" && password == "padmin")
        {

        }
    }

 */

    @Override
    public void onClick(View view) {
        String username = edUserName.getText().toString();
        String password = edUserName.getText().toString();
        clickedBTN = (Button) view;
        if(username != "admin" || password != "padmin")
        {
            String result = "Wrong username or password.";
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();
        }
        else if (username == "admin" && password == "padmin")
        {
            Intent intent = new Intent(this,TransportActivity.class);
            intent.putExtra("schedule",clickedBTN.getText().toString());

        }
    }
}