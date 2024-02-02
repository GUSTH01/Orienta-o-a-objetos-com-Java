import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sera o tamanho do vetor ");
        int n = sc.nextInt();

        double media = 0;
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero ");
            vetor[i] = sc.nextDouble();
            media += vetor[i];
        }
        media /= n;
        System.out.println("Média do vetor "+ media);
        System.out.println("Elementos abaixo da média :");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) System.out.println("vetor = " + vetor[i]);
        }


    }
}