import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pessoas serão digitadas : ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];
        int cont = 1;
        double media = 0 ;
        int quantidade = 0;
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.printf("Qual o nome da pessoa"+cont + "?");
            String nome = sc.nextLine();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new Pessoa( nome, idade, altura);
            media = media + altura;

            if (idade < 16){
                quantidade += 1;

            }
            cont++;
        }
        double totalquant = (quantidade * 100) / n;
        String[] nomes = new String[quantidade];
        cont = 1;
        int contt = 0;

        System.out.println("################################\n ##############################");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da Pessoa:"+ cont );
            System.out.println(vetor[i].getNome());
            System.out.println(vetor[i].getIdade());
            System.out.println(vetor[i].getAltura());
            if (vetor[i].getIdade() < 16) {
                nomes[contt] = vetor[i].getNome();
                contt ++;
            }
            cont ++;

        }
        System.out.printf("Altura média é: %.2f", media / n );
        System.out.println(quantidade);


        System.out.println("\nPessoas com menos de 16 anos: "+totalquant+ "%");

            for (int j = 0; j < nomes.length; j++) {
                System.out.println(nomes[j]);
            }
        }
    }
