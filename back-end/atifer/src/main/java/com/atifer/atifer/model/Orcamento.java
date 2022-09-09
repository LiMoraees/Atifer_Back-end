package com.atifer.atifer.model;


public class Orcamento {
    private String nome, data, validade;
    private int itens, id;
    private static int idCounter = 0;

    public Orcamento(){
        this.id = ++Orcamento.idCounter;
    }

    public Orcamento(String nome, String data, String validade, int itens) {
        this.nome = nome;
        this.data = data;
        this.validade = validade;
        this.itens = itens;
        this.id = ++Orcamento.idCounter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

}

