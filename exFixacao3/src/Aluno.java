public class Aluno {

    public String aluno;
    public double nota1;
    public double nota2;
    public double nota3;


    public double notaFinal() {
        return nota1 + nota2 + nota3 ;

    }


    @Override
    public String toString() {
        return "Aluno{" +
                "aluno='" + aluno + '\'' +
                ", notaFinal=" + notaFinal() +
                '}';
    }
}
