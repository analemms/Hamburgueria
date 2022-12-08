package br.com.hamburgueria;

import br.com.hamburgueria.pojo.ItemIncluso;
import br.com.hamburgueria.pojo.Produto;
import br.com.hamburgueria.pojo.ProdutoInternacional;
import br.com.hamburgueria.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class HamburgueriaApp { //classe principal
    public static void main(String[] args) { //método principal
        Produto meuProduto = new Produto(); //criando um novo produto

        meuProduto.setNome("Combo 1");
        meuProduto.setValor(49.99);
        meuProduto.setTamanho("Serve 2 pessoas");


        List<ItemIncluso> itensInclusos = new ArrayList<>(); //criação de uma variável itens inclusos sendo uma lista de itens

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Hamburguers artesanais", 2);//objeto representados por classes
        itensInclusos.add(primeiroItemIncluso); //adicionando itens na lista

        ItemIncluso segundoItemIncluso = new ItemIncluso("Porções de batata frita", 2);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Refrigerantes", 2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getItensInclusos().size()); //pegando meus itens e mostrando o tamanho da lista
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca()); //já foi definido, a marca vem antes

        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {//Laços - itens inclusos é a lista - mostrar o nome e qntd de cada um dos itens
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabaram-se os itens");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Vegan"); //testando a herança
        meuProdutoNacional.setImpostoNacional(0.23); //testando a implementação
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Vegan");//Polimorfismo: testando é possível assim reescrever um dos métodos
        meuProdutoInternacional.setValor(-150.00);

    }

}
