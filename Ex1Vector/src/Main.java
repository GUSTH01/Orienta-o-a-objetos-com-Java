import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DESCRIÇÃO DO EX : Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você ira digitar ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {

            System.out.println("Você só pode digitar numeros a baixo entre 1 e 10");
            n = sc.nextInt();
        }

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite um numero : ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Os numeros negativos são: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0){
                System.out.println(vetor[i]);

            }
        }

    }
}