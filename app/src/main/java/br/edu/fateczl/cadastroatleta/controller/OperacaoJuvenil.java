package br.edu.fateczl.cadastroatleta.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.cadastroatleta.model.AtletaJuvenil;

public class OperacaoJuvenil implements IOperacao<AtletaJuvenil> {

    private static OperacaoJuvenil instance;
    private List<AtletaJuvenil> lista;

    private OperacaoJuvenil(){
        this.lista = new ArrayList<>();
    }

    public static OperacaoJuvenil getInstance() {
        if (instance == null) {
            instance = new OperacaoJuvenil();
        }
        return instance;
    }

    @Override
    public void cadastrar(AtletaJuvenil atletaJuvenil) {
        lista.add(atletaJuvenil);
    }

    @Override
    public List<AtletaJuvenil> listar() {
        return lista;
    }
}
