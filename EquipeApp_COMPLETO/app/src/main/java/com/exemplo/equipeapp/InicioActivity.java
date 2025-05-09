package com.exemplo.equipeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class InicioActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(InicioActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    }
}
