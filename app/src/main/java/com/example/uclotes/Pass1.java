package com.example.uclotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import javax.security.auth.Destroyable;

public class Pass1 extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass1);


        DisplayMetrics medidadventa = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidadventa);

        int ancho=medidadventa.widthPixels;
        int alto= medidadventa.heightPixels;

        getWindow().setLayout((int)(ancho*0.85), (int)(alto*0.5));

        siguiente=findViewById(R.id.next1);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pass1.this, Pass2.class));
            }
        });



    }
}