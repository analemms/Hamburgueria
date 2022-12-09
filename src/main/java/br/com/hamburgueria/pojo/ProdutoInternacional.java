package br.com.hamburgueria.pojo;

import br.com.hamburgueria.interfaces.Importante;

public class ProdutoInternacional extends Produto implements Importante { //herança
     private double taxaDeImportação;

    public ProdutoInternacional (String marcaInicial) {
        super (marcaInicial);
    }

    public void setValor(double novoValor) { //Parâmetro de atribuição de valor - aplicando Polimorfismo
        if (novoValor > -150) { //Estrutura de decisão
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Os valores necessitam ser maiores que -150.00!");//Lançando uma exceção - argumento passado n é válido
        }
    }

    public double getTaxaDeImportação() {
        return taxaDeImportação;
    }

    public void setTaxaDeImportação(double taxaDeImportação) {
        this.taxaDeImportação = taxaDeImportação;
    }

    public String getDadosImportantes() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
