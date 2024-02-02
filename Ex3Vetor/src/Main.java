import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeoros você ira digitar");
        int cont = 0;
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();

        }

        System.out.println("Os numeros pares são: ");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
                cont ++;
            }

        }
        System.out.println("Quantidade de numeros pares: "+ cont);
    }
}