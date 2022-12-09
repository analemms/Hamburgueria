package br.com.hamburgueria.pojo;

import br.com.hamburgueria.interfaces.Importante;

public class ProdutoNacional extends Produto implements Importante { //Herança

    private double impostoNacional; // Implementando as coisas que são específicas do produto nacional e aplicando encapsulamento no campo

    public ProdutoNacional (String marcaInicial) { //construtor
        super (marcaInicial);
    }

    public double getImpostoNacional() { //Quando alguém chamar o get imposto nacional, o retorno é o imposto nacional
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }

    public String getDadosImportantes(){ //Interfaces
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor(); //concatenação p juntar duas info

    }
}
