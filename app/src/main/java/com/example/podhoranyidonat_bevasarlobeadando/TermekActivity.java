package com.example.podhoranyidonat_bevasarlobeadando;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.network.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TermekActivity extends AppCompatActivity {
    private EditText nevEditText, egysegArEditText, mennyisegEditText;
    private Button modositasButton, torlesButton, megseButton;
    private TermekApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termek);

        nevEditText = findViewById(R.id.nevEditText);
        egysegArEditText = findViewById(R.id.egysegArEditText);
        mennyisegEditText = findViewById(R.id.mennyisegEditText);

        modositasButton = findViewById(R.id.modositasButton);
        torlesButton = findViewById(R.id.torlesButton);
        megseButton = findViewById(R.id.megseButton);

        api = ApiClient.getRetrofitInstance().create(TermekApi.class);

        // Példa hívások gombokra
        modositasButton.setOnClickListener(v -> modositas());
        torlesButton.setOnClickListener(v -> torles());
        megseButton.setOnClickListener(v -> finish()); // Visszatérés a listához
    }

    private void modositas() {
        // API hívás a módosításhoz
    }

    private void torles() {
        // API hívás a törléshez
    }
}
