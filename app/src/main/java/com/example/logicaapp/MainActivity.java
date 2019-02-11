package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private char res1 = 'T';
    private char res2 = 'F';
    private char res3 = 'F';
    private char res4 = 'F';

    private EditText ans1;
    private EditText ans2;
    private EditText ans3;
    private EditText ans4;

    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.buttonSubmit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans1 = findViewById(R.id.answer1);
                ans2 = findViewById(R.id.answer2);
                ans3 = findViewById(R.id.answer3);
                ans4 = findViewById(R.id.answer4);

                char a1 = (ans1.getText().toString()).charAt(0);
                char a2 = (ans2.getText().toString()).charAt(0);
                char a3 = (ans3.getText().toString()).charAt(0);
                char a4 = (ans4.getText().toString()).charAt(0);

                String message;
                if (a1 == res1 && a2 == res2 && a3 == res3 && a4 == res4) {
                    message = getString(R.string.great);
                } else {
                    message = getString(R.string.wrong);
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

