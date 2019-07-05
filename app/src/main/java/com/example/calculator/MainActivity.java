package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2;
    EditText e1,e2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b1.setText("Mode: Addition");

        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        tv=findViewById(R.id.textView);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.equals(b1)) {
            if(b1.getText().toString().equals("Mode: Addition")) b1.setText("Mode: Subtraction");
            else if(b1.getText().toString().equals("Mode: Subtraction")) b1.setText("Mode: Multiplication");
            else if(b1.getText().toString().equals("Mode: Multiplication")) b1.setText("Mode: Division");
            else if(b1.getText().toString().equals("Mode: Division")) b1.setText("Mode: Addition");
        }

        else if(v.equals(b2)) {
            Double a=Double.parseDouble(e1.getText().toString());
            Double b=Double.parseDouble(e2.getText().toString());
            if(b1.getText().toString().equals("Mode: Addition")) tv.setText(String.valueOf(a+b));
            else if(b1.getText().toString().equals("Mode: Subtraction")) tv.setText(String.valueOf(a-b));
            else if(b1.getText().toString().equals("Mode: Multiplication")) tv.setText(String.valueOf(a*b));
            else if(b1.getText().toString().equals("Mode: Division")) tv.setText(String.valueOf(a/b));
        }
    }
}
