public class Retangulo {

    public double altura;

    public double largura;

    public double calculaArea(){
        return  altura * largura;
    }

    public double calculaPerimetro(){
        return altura * 2 + largura * 2;
    }

    public double calculaDiagonal(){
        return (altura * altura + largura * largura)  ;

    }

    @Override
    public String toString() {
        return  "Os dados do Retângulo são {"
                +"Altura : "
                + altura
                + "\n Largura : "
                + largura
                + "\n Area: "
                + calculaArea()
                + "\n Perimetro: "
                + calculaPerimetro()
                + "\n Diagonal: "
                + Math.sqrt(calculaDiagonal())
                + "}";
    }
}
