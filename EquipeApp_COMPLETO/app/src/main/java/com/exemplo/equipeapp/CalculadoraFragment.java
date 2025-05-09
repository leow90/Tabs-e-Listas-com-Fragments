package com.exemplo.equipeapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.snackbar.Snackbar;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class CalculadoraFragment extends Fragment {

    private EditText n1, n2, n3;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calculadora, container, false);

        n1 = v.findViewById(R.id.nota1);
        n2 = v.findViewById(R.id.nota2);
        n3 = v.findViewById(R.id.nota3);
        Button calcular = v.findViewById(R.id.btnCalcular);
        Button resetar = v.findViewById(R.id.btnReset);

        calcular.setOnClickListener(view -> {
            try {
                float media = (
                    Float.parseFloat(n1.getText().toString()) +
                    Float.parseFloat(n2.getText().toString()) +
                    Float.parseFloat(n3.getText().toString())
                ) / 3;

                String status = media < 4 ? "Reprovado" : media < 6 ? "Recuperação" : "Aprovado";
                Snackbar.make(view, "Média: " + media + " - " + status, Snackbar.LENGTH_LONG).show();
            } catch (NumberFormatException e) {
                Snackbar.make(view, "Preencha todas as notas corretamente!", Snackbar.LENGTH_SHORT).show();
            }
        });

        resetar.setOnClickListener(view -> {
            n1.setText(""); n2.setText(""); n3.setText("");
        });

        return v;
    }
}
