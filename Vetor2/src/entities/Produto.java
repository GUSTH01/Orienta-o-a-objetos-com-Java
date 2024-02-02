package entities;

public class Produto {

    private String name;
    private double valorProduto;

    public Produto(String name, double valorProduto) {
        this.name = name;
        this.valorProduto = valorProduto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name  +
                ", valorProduto=" + valorProduto +
                '}';
    }
}
