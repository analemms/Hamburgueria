package br.com.hamburgueria;

import br.com.hamburgueria.pojo.ItemIncluso;
import br.com.hamburgueria.pojo.Produto;
import br.com.hamburgueria.pojo.ProdutoInternacional;
import br.com.hamburgueria.pojo.ProdutoNacional;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HamburgueriaApp { //classe principal
    public static void main(String[] args) { //método principal
        LocalDate data = LocalDate.now(); //Datas
        System.out.println(data);
        LocalTime hora = LocalTime.now();
        System.out.println(hora);
        LocalDateTime completo = LocalDateTime.now();
        System.out.println(completo);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataformatada = formatador.format(completo);
        System.out.println(dataformatada);

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
        meuProdutoInternacional.setValor(49.99);

    }

}
