import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você ira digitar :");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        int posicao = 0;
        double maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero :");
            vetor[i] = sc.nextDouble();

        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i + 1;
            }
        }
        System.out.println("maior valor = " + maior);
        System.out.println("posicao do maior = " + posicao);

    }
}