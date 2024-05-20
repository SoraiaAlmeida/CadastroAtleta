package br.edu.fateczl.cadastroatleta.model;

import androidx.annotation.NonNull;

public class Atleta {
    private String nome;
    private String dataNascimento;
    private String bairro;

    public Atleta() {
    }

    public Atleta(String nome, String dataNascimento, String bairro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}