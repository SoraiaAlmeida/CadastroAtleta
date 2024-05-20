package br.edu.fateczl.cadastroatleta.controller;

import java.util.ArrayList;
import java.util.List;


import br.edu.fateczl.cadastroatleta.model.OutroAtleta;

public class OperacaoOutro implements IOperacao<OutroAtleta> {

    private static OperacaoOutro instance;
    List<OutroAtleta> lista;


    public OperacaoOutro() {
        this.lista = new ArrayList<>();
    }

    public static OperacaoOutro getInstance() {
        if (instance == null) {
            instance = new OperacaoOutro();
        }
        return instance;
    }

    @Override
    public void cadastrar(OutroAtleta outroAtleta) {
        lista.add(outroAtleta);
    }


    @Override
    public List<OutroAtleta> listar() {
        return this.lista;
    }
}

