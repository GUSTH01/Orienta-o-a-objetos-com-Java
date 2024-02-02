public class Pessoa {

    public String nome ;

    public double salarioBruto;

    public double taxa ;

    public double porcentagemIncremento;

    public double salarioLiquido;

    public double salarioLiquido(){
        return salarioLiquido = salarioBruto - taxa;
    }

    public void incrementaSalario(double porcentagemIncremento){
        this.porcentagemIncremento = porcentagemIncremento;
        salarioBruto = salarioBruto + (salarioBruto * porcentagemIncremento) / 100;


    }



    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\n' +
                ", salarioLiquido=" + salarioLiquido() +
                '}' + porcentagemIncremento;
    }
}
