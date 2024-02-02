import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<>();

        int ide = 0;
        String nomee ;
        double salari = 0;

        int index ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas entradas você fará");
        int entrada = sc.nextInt();

        for (int i = 0; i < entrada; i++) {

            System.out.println("qual o id da pessoa");
            ide = sc.nextInt();
            sc.nextLine();
            System.out.println("qual o nome da pessoa");
            nomee = sc.nextLine();
            System.out.println("qual o salario da pessoa");
            salari = sc.nextDouble();

            id.add(ide);
            nome.add(nomee);
            salario.add(salari);
        }

        System.out.println("Qual o Id do usuario que deseja aumentar o salario?");
        int idAumento = sc.nextInt();
        System.out.println("Quanto deseja aumentar no salario dele ?");
        int aumento = sc.nextInt();

        index = id.lastIndexOf(idAumento);

        for (int i = 0; i <= index ; i++) {
            if (i == index){
                salario<> =
            }
        }




    }
}