package Entities;

public class Conta {

    private int numeroConta;
    private String nomeConta;
    private double money;

    public Conta(){

    }
    public Conta(int numeroConta, String nomeConta){
        this.numeroConta = numeroConta;
        this.nomeConta = nomeConta;

    }

    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNomeConta(){
        return nomeConta;
    }
    public void setNomeConta(String nomeConta){
        this.nomeConta = nomeConta;
    }

    public void deposite(double money){
        this.money += money;
    }

    public void saque(double money){
        this.money = this.money - money - 5;
    }

    @Override
    public String toString() {
        return "{ "+"Numero da conta : " + numeroConta
                + "\n Nome do proprietario : "+ nomeConta
                + "\n Saldo Conta :  "+ money +
                " }";
    }
}
