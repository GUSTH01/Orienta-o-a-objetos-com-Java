import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Entre com o raio:");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference : %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI value: %.2f", Calculator.pi);

    }


}