import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quais os valores de cada vetor");
        int n  = sc.nextInt();

        int[] vetora = new int[n];
        int[] vetorb = new int[n];

        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < n; i++) {

            vetora[i] = sc.nextInt();

        }  System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < n; i++) {

            vetorb[i] = sc.nextInt();

        }

        System.out.println("Valor resultante: ");
        for (int i = 0; i < n; i++) {
            int total = vetora[i] + vetorb[i];
            System.out.println(total);
        }

    }
}