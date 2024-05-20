package br.edu.fateczl.cadastroatleta.model;

import androidx.annotation.NonNull;
public class AtletaSenior extends Atleta {
    private boolean problemasCardiacos;

    public AtletaSenior() {
        super();
    }

    public AtletaSenior(String nome, String dataNascimento, String bairro, boolean problemasCardiacos) {
        super(nome, dataNascimento, bairro);
        this.problemasCardiacos = problemasCardiacos;
    }

    public boolean isProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + ", problemasCardiacos=" + problemasCardiacos + '}';
    }
}