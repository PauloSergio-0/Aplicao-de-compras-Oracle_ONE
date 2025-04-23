package br.com.oracleone.apiclacaocompras.models;

public class Compras implements Comparable<Compras>{
    private String descricaoProduto;
    private double valorProduto;

    public Compras(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public int compareTo(Compras o) {
        return Double.compare(this.getValorProduto(),o.getValorProduto());
    }
}
