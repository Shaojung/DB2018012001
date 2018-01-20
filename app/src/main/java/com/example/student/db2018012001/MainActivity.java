package com.example.student.db2018012001;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click Click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void click1(View v)
    {
        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello World");
        tv.setTextColor(Color.RED);
    }
}
