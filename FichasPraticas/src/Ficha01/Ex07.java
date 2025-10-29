package Ficha01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calcular o preço total de 3 produtos com desconto 10%");

        int preco1, preco2, preco3;
        double total;

        System.out.print("Introduza o primeiro preço:");
        preco1 = input.nextInt();

        System.out.print("Introduza o segundo preço:");
        preco2 = input.nextInt();

        System.out.print("Introduza o terceiro preço:");
        preco3 = input.nextInt();

        total = (preco1 + preco2 + preco3) * 0.9;

        System.out.printf("O preço total é: %.2f", total);
        System.out.print("€");

    }
}
