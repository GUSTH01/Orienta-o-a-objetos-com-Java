import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i ++){

            System.out.println("Digite um numero");
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i ++){
            sum += vect [i];

        }

        double avg = sum / n;

        System.out.printf("A media é : %.2f", avg);


    }
}