import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do retangulo");
        retangulo.altura = sc.nextDouble();
        System.out.println();
        System.out.println("Digite Largura do retangulo");
        retangulo.largura = sc.nextDouble();

        System.out.println(retangulo);

    }
}