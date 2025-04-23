package br.com.oracleone.apiclacaocompras.models;

public class Cartao {
    private double limite;
    private double saldo;
    private String nomeCartao;

    public Cartao(double limite, String nomeCartao){
        this.limite = limite;
        this.saldo = limite;
        this.nomeCartao = nomeCartao;
    }


    public boolean realizarCompra(double valorComprar){
        if(this.saldo >= valorComprar) {
             this.saldo -= valorComprar;
            return true;
        }else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}
