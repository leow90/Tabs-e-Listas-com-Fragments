package com.exemplo.equipeapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalhesIntegranteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_integrante);

        String nome = getIntent().getStringExtra("nome");
        String cargo = getIntent().getStringExtra("cargo");

        ((TextView) findViewById(R.id.tvDetalheNome)).setText("Nome: " + nome);
        ((TextView) findViewById(R.id.tvDetalheCargo)).setText("Cargo: " + cargo);
    }
}
