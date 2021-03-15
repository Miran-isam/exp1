package com.example.myeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1 = findViewById(R.id.weigh1);
    EditText ed2 = findViewById(R.id.heigh1);

    TextView tex1 =findViewById(R.id.textView2);
    Button b1 = (Button)findViewById(R.id.btm);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultt();
            }
        });

    }

    private void resultt() {
        float a =Float.parseFloat(ed1.getText().toString())/100;
        float b =Float.parseFloat(ed2.getText().toString())/100;
        float c= b/(a*a);
        tex1.setText(""+c);
    }

}