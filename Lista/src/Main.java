import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //O tipo LIST é interface então para criar uma lista é necessario usar uma classe que implementa a interface
        // ArrayList, LinkedList etc...

        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("alex");
        list.add("bob");
        list.add("ana");

        list.add(2, "marco");

        System.out.println(list.size());

        for (String x: list) {

            System.out.println(x);

        }
        System.out.println("--------------------------");

        list.removeIf(x -> x.charAt(0)== 'm');

        for (String x: list) {

            System.out.println(x);

        }

        System.out.println("Posição bob" + list.lastIndexOf("bob"));

        System.out.println("--------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());

        for (String x: result) {
            System.out.println(x);
        }

        System.out.println("--------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'b').findFirst().orElse(null);
        System.out.println(name);

    }
}