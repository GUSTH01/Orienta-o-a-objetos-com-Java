import entities.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho: ");
        int n = sc.nextInt();


        Produto[] vector = new Produto[n];

        for ( int i = 0 ; i < vector.length; i ++){
            sc.nextLine();
            System.out.println("Digite o numero:");
            String name = sc.nextLine();
            double preco = sc.nextDouble();
            vector[i] = new Produto(name, preco);
        }

        double soma = 0;
        for (int i = 0; i < vector.length; i++) {
        soma += vector[i].getValorProduto();
        }

        double avg = soma / vector.length;
        System.out.printf("Media: %.2f", avg);

    }
}