package application;

import entities.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     Product product = new Product();

        System.out.println("Entre com os dados do produto: ");
        System.out.println("Nome: ");
        product.setName(sc.nextLine());
        System.out.println("Preço");
        product.setPrice(sc.nextDouble());

        System.out.println("Product data: " + product);

        System.out.println("Entre com o numero de produtos para serem armazenados no estoque: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println("Entre com o numero de produtos para serem removidos no estoque: ");
        System.out.println();
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " + product);

        //System.out.println("product = " + product.name + ", Quantidade: " + product.quantity + ", Preço: " + product.price );



    }
}
