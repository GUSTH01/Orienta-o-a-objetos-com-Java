import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas entradas você fará");
        int entrada = sc.nextInt();

        for (int i = 0; i < entrada; i++) {

            System.out.println("qual o id da pessoa");
            pessoa.setId(sc.nextInt());
            System.out.println("qual o nome da pessoa");
            pessoa.setNome(sc.nextLine());
            System.out.println("qual o id da pessoa");
            pessoa.setSalario(sc.nextDouble());

            list.add(String.valueOf(pessoa));

        }

        System.out.println(list);



    }
}