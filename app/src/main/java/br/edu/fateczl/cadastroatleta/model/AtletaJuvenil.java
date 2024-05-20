package br.edu.fateczl.cadastroatleta.model;

import androidx.annotation.NonNull;

public class AtletaJuvenil extends Atleta {
    private int anosPratica;

    public AtletaJuvenil() {
        super();
           }
    public AtletaJuvenil(String nome, String dataNascimento, String bairro, int anosPratica) {
        super(nome, dataNascimento, bairro);
        this.anosPratica = anosPratica;
    }

    public int getAnosPratica() {
        return anosPratica;
    }


    public void setAnosPratica(int anosPratica) {
        this.anosPratica = anosPratica;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + ", anosPratica=" + anosPratica + '}';
    }
}
