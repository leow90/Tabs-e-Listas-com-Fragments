package com.exemplo.equipeapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class IntegrantesFragment extends Fragment implements IntegranteAdapter.OnItemClickListener {

    private List<Integrante> lista;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_integrantes, container, false);
        RecyclerView recycler = view.findViewById(R.id.recyclerIntegrantes);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        lista = new ArrayList<>();
        lista.add(new Integrante("Leonardo Alves", "Desenvolvedor"));
        lista.add(new Integrante("Fulano de Tal", "Designer"));

        IntegranteAdapter adapter = new IntegranteAdapter(lista, this);
        recycler.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(Integrante integrante) {
        Intent intent = new Intent(getContext(), DetalhesIntegranteActivity.class);
        intent.putExtra("nome", integrante.getNome());
        intent.putExtra("cargo", integrante.getCargo());
        startActivity(intent);
    }
}
