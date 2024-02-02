import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sera o tamanho do vetor ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        double media = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                media += vetor[i];
            }

        }
        if(media == 0) {
            System.out.println("Nenhum numero par");
        }else {
            media /= n;
            System.out.println("media dos pares = "+ media);
        }

    }
}
