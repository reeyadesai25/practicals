package com.example.calculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvAns;
    Button btn1,btn2,btn3,btn4,btn5;
    EditText etNo1,etNo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvAns=findViewById(R.id.tvAns);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        etNo1=findViewById(R.id.etNo1);
        etNo2=findViewById(R.id.etNo2);

        btn1.setOnClickListener(v -> {
            String no1=etNo1.getText().toString();
            String no2=etNo2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "Enter No1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "Enter No2", Toast.LENGTH_SHORT).show();
            } else {
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result = i+j;

                tvAns.setText("The Answer is: " + result);
            }
        });

        btn2.setOnClickListener(v -> {
            String no1=etNo1.getText().toString();
            String no2=etNo2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "Enter No1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "Enter No2", Toast.LENGTH_SHORT).show();
            } else {
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result = i-j;

                tvAns.setText("The Answer is: " + result);
            }
        });

        btn3.setOnClickListener(v -> {
            String no1=etNo1.getText().toString();
            String no2=etNo2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "Enter No1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "Enter No2", Toast.LENGTH_SHORT).show();
            } else {
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result = i*j;

                tvAns.setText("The Answer is: " + result);
            }
        });

        btn4.setOnClickListener(v -> {
            String no1=etNo1.getText().toString();
            String no2=etNo2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "Enter No1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "Enter No2", Toast.LENGTH_SHORT).show();
            } else {
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result = i/j;

                tvAns.setText("The Answer is: " + result);
            }
        });

        btn5.setOnClickListener(v -> {
            String no1=etNo1.getText().toString();
            String no2=etNo2.getText().toString();

            if(TextUtils.isEmpty(no1)){
                Toast.makeText(this, "Enter No1", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(no2)) {
                Toast.makeText(this, "Enter No2", Toast.LENGTH_SHORT).show();
            } else {
                int i=Integer.parseInt(no1);
                int j=Integer.parseInt(no2);

                int result = i%j;

                tvAns.setText("The Answer is: " + result);
            }
        });
    }
}