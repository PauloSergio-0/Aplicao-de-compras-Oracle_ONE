package br.com.oracleone.apiclacaocompras.models;

public class Compra implements Comparable<Compra>{
    private String descricaoProduto;
    private double valorProduto;

    public Compra(String descricaoProduto, double valorProduto) {
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.compare(this.getValorProduto(),o.getValorProduto());
    }

    @Override
    public String toString() {
        return String.format("""
                Descricao: %s
                Valor produto: %.2f
                """, this.descricaoProduto, this.valorProduto);
    }
}
