public class Pessoa {

    private int id;

    private String nome;

    private double salario;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario(double salario){
        this.salario += this.salario * salario / 100;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
