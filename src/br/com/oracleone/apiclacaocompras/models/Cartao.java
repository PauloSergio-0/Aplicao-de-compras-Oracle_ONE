package br.com.oracleone.apiclacaocompras.models;

public class Cartao {
    private double limite;
    private String nomeCartao;

    public Cartao(double limite, String nomeCartao){
        this.limite = limite;
        this.nomeCartao = nomeCartao;
    }


    public boolean realizarCompra(double valorComprar){
        if(this.limite > valorComprar) {
            this.limite =- valorComprar;
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }


}
