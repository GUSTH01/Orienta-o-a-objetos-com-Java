import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com os dados do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX= x.area();
        double areaY = y.area();

        System.out.println("areaX = " + areaX);
        System.out.printf("areaY = " + areaY);

    }
}
