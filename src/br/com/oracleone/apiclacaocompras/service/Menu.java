package br.com.oracleone.apiclacaocompras.service;

import br.com.oracleone.apiclacaocompras.models.Cartao;
import br.com.oracleone.apiclacaocompras.models.Compras;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu implements Exception{
    private Cartao meuCartao;
    private final  ArrayList<Compras> listaCompras = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    public void menu(){

    }

    private Cartao criarConta(){
        while(true){
            try {
                System.out.println("Qual o limite do Cartão: ");
                double limiteCartao = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Nome do portador do cartão: ");
                String nomeCartao = scanner.nextLine();

                return new Cartao(limiteCartao,nomeCartao);

            } catch (Exception e) {
                System.out.println("Algo deu errado: ");
                throw new RuntimeException(e);
            }

        }
    }
}
