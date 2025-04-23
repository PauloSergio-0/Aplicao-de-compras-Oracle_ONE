package br.com.oracleone.apiclacaocompras.models;

public class Compras {
    private String descricaoProduto;
    private double valorProduto;

    public Compras(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }
}
