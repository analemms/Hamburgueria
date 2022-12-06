package br.com.hamburgueria.pojo;

import java.util.List;

public class Produto { //classe produto e seus atributos
    private String nome;//encapsulamento dos atributos - classe restrita
    private double valor;
    private String tamanho;
    private List<String> itensInclusos; //Classe e Estrutura de dado - lista

    public double getValor() { //parâmetro de busca de valor
        return this.valor;
    }

    public void setValor(double novoValor) { //parâmetro de atribuição de valor
        if (novoValor > 0) { //Estrutura de decisão
        this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Os valores necessitam ser maiores que 0!");//lançando uma exceção - argumento passado n é válido
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
