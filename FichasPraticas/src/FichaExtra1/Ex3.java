package FichaExtra1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco;

        System.out.print("Introduza o preço do seu produto: ");
        preco = input.nextDouble();

        if ( preco >= 100 ) {

            preco = preco - (preco * 0.1);
            System.out.println("Preço final: " + preco + " com 10% de desconto.");

        } else {

            System.out.println("Preço final: " + preco + ". ( Sem desconto )");
        }
    }
}
