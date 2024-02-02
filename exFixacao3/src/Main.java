import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite as três notas do aluno:");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        double notaFinal = aluno.notaFinal();
        System.out.printf("Sua nota é: "+ aluno.notaFinal() );
        if (notaFinal < 60){
            notaFinal = 60 - notaFinal;
            System.out.println("\nFailed");
            System.out.printf("Para você Passar restam "+ notaFinal +" Pontos");
        }else{
            System.out.println("\n Pass");
        }

    }
}