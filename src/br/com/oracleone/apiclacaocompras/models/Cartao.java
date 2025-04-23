package br.com.oracleone.apiclacaocompras.models;

public class Cartao {
    private double limite;
    private String nomeCartao;

    public Cartao(double limite, String nomeCartao){
        this.limite = limite;
        this.nomeCartao = nomeCartao;
    }


    public boolean realizarCompra(double valorComprar){
        if(this.limite >= valorComprar) {
             this.limite = (this.limite - valorComprar);
            return true;
        }else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }
}
