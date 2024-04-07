import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("aj");
        a.add("jlllllllllllllllllllllllllllllllllllllllllllllll");
        a.add("cc");
        b.add("pa");
        b.add("dg");
        b.add("cc");
        String[] result = new String[a.size()];

        for (int i = 0; i < a.size(); i++) {
            String palavra = a.get(i);
            String palavra2 = b.get(i);
            int quant = palavra.length();
            int quant2 = palavra2.length();
            for (int j = 0; j < quant; j++) {
                for (int k = 0; k < quant2; k++) {
                    if (palavra.charAt(j) == palavra2.charAt(k)) {
                        result[i] = "Sim";
                        break;
                     } else if (palavra.charAt(j) != palavra2.charAt(k)) {
                        result[i] = "Não";
                    }
                }
                if (result[i].contains("Sim")){
                    break;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(i +" "+ result[i]);
        }
    }
}
