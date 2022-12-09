package br.com.hamburgueria.pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    public ItemIncluso (String nomeInicial, int quantidadeIncial){ //construtor
        this.nome = nomeInicial;
        this.quantidade = quantidadeIncial;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
