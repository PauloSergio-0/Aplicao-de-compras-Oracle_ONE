package br.com.oracleone.apiclacaocompras.service;

import br.com.oracleone.apiclacaocompras.models.Cartao;
import br.com.oracleone.apiclacaocompras.models.Compras;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private Cartao meuCartao;
    private final ArrayList<Compras> listaCompras = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    public void menu() {
        meuCartao = criarConta();

        while (true) {
            try {
                System.out.println("""
                        1.Relizar compra
                        2.ListarCompras
                        3.sair
                        """);
                int opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1) {
                    meuCartao.realizarCompra(9);
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro de captura de valores tente novamente!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Algo deu errado: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }


    private Cartao criarConta() {
        while (true) {
            try {
                System.out.println("Qual o limite do Cartão: ");
                double limiteCartao = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Nome do portador do cartão: ");
                String nomeCartao = scanner.nextLine();

                return new Cartao(limiteCartao, nomeCartao);

            } catch (InputMismatchException e) {
                System.out.println("Erro de captura de valores tente novamente!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Algo deu errado: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
