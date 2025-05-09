package com.exemplo.equipeapp;

public class Integrante {
    private final String nome;
    private final String cargo;

    public Integrante(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
}
