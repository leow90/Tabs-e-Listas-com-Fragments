package com.exemplo.equipeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class IntegranteAdapter extends RecyclerView.Adapter<IntegranteAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Integrante integrante);
    }

    private final List<Integrante> lista;
    private final OnItemClickListener listener;

    public IntegranteAdapter(List<Integrante> lista, OnItemClickListener listener) {
        this.lista = lista;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_integrante, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Integrante integrante = lista.get(position);
        holder.nome.setText(integrante.getNome());
        holder.cargo.setText(integrante.getCargo());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(integrante));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nome, cargo;

        public ViewHolder(View v) {
            super(v);
            nome = v.findViewById(R.id.tvNome);
            cargo = v.findViewById(R.id.tvCargo);
        }
    }
}
