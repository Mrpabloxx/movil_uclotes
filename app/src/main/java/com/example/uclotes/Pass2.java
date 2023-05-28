package com.example.uclotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class Pass2 extends AppCompatActivity {

    Button empezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass2);

        DisplayMetrics medidadventa2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidadventa2);

        int ancho=medidadventa2.widthPixels;
        int alto= medidadventa2.heightPixels;

        getWindow().setLayout((int)(ancho*0.85), (int)(alto*0.5));

        empezar=findViewById(R.id.next2);

        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pass2.this, NewHome.class));
            finish();
            }

        });



    }
}