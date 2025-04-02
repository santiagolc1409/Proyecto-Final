package com.santiago.evidencia2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos
        ImageView featuredImage = findViewById(R.id.featuredImage);
        Button btnPlay = findViewById(R.id.btnPlay);
        Button btnInfo = findViewById(R.id.btnInfo);
        EditText searchBar = findViewById(R.id.searchBar);

        // Acción del botón Play
        btnPlay.setOnClickListener(v -> {
            // Lógica para reproducir contenido
        });

        // Acción del botón Info
        btnInfo.setOnClickListener(v -> {
            // Lógica para mostrar información
        });
    }
}