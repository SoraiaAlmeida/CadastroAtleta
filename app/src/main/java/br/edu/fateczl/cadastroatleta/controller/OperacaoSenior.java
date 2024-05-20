package br.edu.fateczl.cadastroatleta.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.cadastroatleta.model.AtletaSenior;

public class OperacaoSenior implements IOperacao<AtletaSenior> {

    private static OperacaoSenior instance;
    List<AtletaSenior> lista;

    public OperacaoSenior(){
        this.lista = new ArrayList<>();

    }

    public static OperacaoSenior getInstance() {
        if (instance == null) {
            instance = new OperacaoSenior();
        }
        return instance;
    }

    @Override
    public void cadastrar(AtletaSenior senior) {
        lista.add(senior);
    }

    @Override
    public List<AtletaSenior> listar() {
        return this.lista;
    }
}
