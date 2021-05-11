package com.example.exe6_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private EditText peso;
    private Button btn_calcular;
    private TextView peso15;
    private TextView peso20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.peso);
        btn_calcular = findViewById(R.id.btn_calcular);
        peso15 = findViewById(R.id.peso15);
        peso20 = findViewById(R.id.peso20);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("0");
                float peso_engordar = Float.parseFloat(peso.getText().toString());
                peso_engordar += (peso_engordar*15)/100;

                float peso_emagrecer = Float.parseFloat(peso.getText().toString());
                peso_emagrecer-= (peso_emagrecer*20)/100;


                peso15.setText("O seu Peso se engordar 15%: " + df.format(peso_engordar));
                peso20.setText("O seu Peso se engordar 20%: " + df.format(peso_emagrecer));


            }
        });
    }
}