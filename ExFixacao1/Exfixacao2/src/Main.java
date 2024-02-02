import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        pessoa.nome = sc.nextLine();
        System.out.println("Digite o salario Bruto da pessoa: ");
        pessoa.salarioBruto = sc.nextDouble();
        System.out.println("Qual a taxa ? ");
        pessoa.taxa = sc.nextDouble();
        System.out.println(pessoa);
        System.out.println("Qual a porcentagem de aumento de salario da pessoa : ");
        double porcentagemIncremento = sc.nextDouble();
        pessoa.incrementaSalario(porcentagemIncremento);
        System.out.println(pessoa);



    }
}