package com.example.uclotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.PopupWindow;

import java.util.Timer;
import java.util.TimerTask;

public class InicioPass1 extends AppCompatActivity {

    private ImageView popup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_pass1);

        TimerTask pasa = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(InicioPass1.this,Pass1.class);
                startActivity(intent);

            }
        };

        Timer tieme =new Timer();
        tieme.schedule(pasa, 1000);
    }
}