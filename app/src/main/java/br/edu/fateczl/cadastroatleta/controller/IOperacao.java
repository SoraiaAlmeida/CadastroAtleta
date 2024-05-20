package br.edu.fateczl.cadastroatleta.controller;

import java.util.List;

public interface IOperacao<T> {
    void cadastrar(T t);
    List<T> listar();
}