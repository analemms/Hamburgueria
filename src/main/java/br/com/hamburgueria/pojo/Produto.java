package br.com.hamburgueria.pojo;

import java.util.List;

public class Produto { //Classe produto (modificador, class e nome da class) e seus atributos(modificador, tipo e nome do atributo)
    private String nome;//Encapsulamento dos atributos - classe restrita - tipo da variável e nome
    protected double valor;
    private String tamanho;
    private String marca;
    private List<ItemIncluso> itensInclusos; //Classe e Estrutura de dado - lista

    public Produto () { //Estrutura de um construtor (modificador e nome da classe)
        this.marca = "Vegan";

    }

    public Produto(String marcaInicial) { //Criei agr esse construtor p produto nacional
    this.marca = marcaInicial;
    }

    public double getValor() { //Parâmetro de busca de valor
        return this.valor;
    } //Método: modificador, tipo do retorno, nome do método

    public void setValor(double novoValor) { //Parâmetro de atribuição de valor
        if (novoValor > 0) { //Estrutura de decisão
        this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Os valores necessitam ser maiores que 0!");//Lançando uma exceção - argumento passado n é válido
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

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
