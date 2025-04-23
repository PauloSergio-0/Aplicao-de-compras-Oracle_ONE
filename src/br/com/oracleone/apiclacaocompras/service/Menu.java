package br.com.oracleone.apiclacaocompras.service;

import br.com.oracleone.apiclacaocompras.models.Cartao;
import br.com.oracleone.apiclacaocompras.models.Compra;

import java.util.*;

public class Menu {
    private Cartao meuCartao;
    private final ArrayList<Compra> listaCompras = new ArrayList<>();
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
                    var tentativaCompra = criaCompra();

                    if(meuCartao.realizarCompra(tentativaCompra.getValorProduto())){
                        listaCompras.add(tentativaCompra);
                    } else {
                        System.out.println("limite insuficiente: " + meuCartao.getLimite());
                    }
                } else  if( opcao == 2) {
                    Collections.sort(listaCompras);
                    for(Compra item: listaCompras){
                        System.out.println(item);
                    }

                }else {
                    System.out.println("Saindo....");
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
                System.out.println("\nQual o limite do Cartão: ");
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

    private Compra criaCompra(){
        while (true){
            try {
                System.out.println("\nDescrição do Produto: ");
                String descricao = scanner.nextLine();

                System.out.println("Valor do produto");
                double valorProduto = scanner.nextDouble();
                scanner.nextLine();

                return new Compra(descricao, valorProduto);

            }catch (InputMismatchException e){
                System.out.println("Erro ao capturar valores");
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Erro ao executar operacao: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
