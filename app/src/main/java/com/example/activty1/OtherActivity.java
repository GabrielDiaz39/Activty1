package com.example.activty1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {
    TextView Datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        recibirDatos();
    }
    private void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("dato01");

        Datos = (TextView) findViewById(R.id.Datos);
        Datos.setText(d1);
    }
}