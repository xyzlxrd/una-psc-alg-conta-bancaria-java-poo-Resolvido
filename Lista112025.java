package com.mycompany.lista;
import java.util.Scanner;

public class Lista112025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.print("Digite o nome da pessoa: ");
        String nome = scan.nextLine();
        System.out.print("Digite o número da conta: ");
        String numConta = scan.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scan.nextDouble();

        ContaBanco conta = new ContaBanco(nome, numConta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.");
        
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scan.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo disponível: R$ " + String.format("%.2f", conta.getSaldo()));
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
