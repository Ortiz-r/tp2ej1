package com.eestn4.ortiz.tp2ej1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Ejercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio1);
        Button boton1 = (Button)findViewById(R.id.button1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1= Toast.makeText(getApplicationContext(), "Esto es un mensaje",Toast.LENGTH_SHORT);
                toast1.show();
            }
        });

    }

}
