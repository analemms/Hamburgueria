package br.com.hamburgueria;

import br.com.hamburgueria.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class HamburgueriaApp { //classe principal
    public static void main(String[] args) { //método principal
        Produto meuProduto = new Produto(); //criando um novo produto

        meuProduto.setNome("Combo 1");
        meuProduto.setValor(30);
        meuProduto.setTamanho("Serve 2 pessoas");

        List<String> itensInclusos = new ArrayList<>(); //criação de uma variável itens inclusos sendo uma lista de strings
        itensInclusos.add("2 Hamburguers artesanais"); //adicionando itens na lista
        itensInclusos.add("2 Porções de batata frita");
        itensInclusos.add("2 Refrigerantes");
        meuProduto.setItensInclusos (itensInclusos);

        System.out.println(meuProduto.getItensInclusos().size()); //pegando meus itens e mostrando o tamanho da lista

        System.out.println(meuProduto.getValor());
    }

}
