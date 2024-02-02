import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoDolar;
        System.out.print("Qual a cotação do dolar?: ");
        precoDolar = sc.nextDouble();
        System.out.print("Quantos dolares você vai comprar?: ");
        double quantity = sc.nextDouble();

        System.out.printf("Voce irá pagar:  "+ Dolar.currencyConverter(precoDolar, quantity));


    }
}