public class Main {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria", "Gustavo", "Péricles"};

        for (int i = 0; i < vetor.length; i++) {

            System.out.println(vetor[i]);

        }

        //FOREACH
        System.out.print("///////////////////////////////////////////////\n");
        for (String nomes : vetor){
            System.out.println(nomes);
        }

    }
}