package Aplication;

import Entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o numero da conta: ");
        conta.setNumeroConta(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o nome do proprietario da conta: ");
        conta.setNomeConta(sc.nextLine());

        System.out.println("Deseja depositar um valor inicial ? 1/2");
        char verifica = sc.next().charAt(0);

        if (verifica == 'n'){
            System.out.println(conta);
            System.out.println();

            System.out.println("Entre com um valor para depositar: ");
            conta.deposite(sc.nextDouble());

            System.out.println("Digite um valor para sacar: ");
            conta.saque(sc.nextDouble());

            System.out.println();
            System.out.println(conta);
        }else {
            System.out.println("Entre com um valor inicial para depositar: ");
            conta.deposite(sc.nextDouble());

            System.out.println();
            System.out.println(conta);
            System.out.println();

            System.out.println("Entre com um valor para depositar: ");
            conta.deposite(sc.nextDouble());

            System.out.println("Digite um valor para sacar: ");
            conta.saque(sc.nextDouble());

            System.out.println();
            System.out.println(conta);

        }
    }
}