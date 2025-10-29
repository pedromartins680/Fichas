package Ficha02;

import java.util.Scanner;

public class Ex06  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ordem decrescente");

        double valor1, valor2;

        System.out.print("Introduza um valor: ");
        valor1 = input.nextDouble();

        System.out.print("Introduza outro valor: ");
        valor2 = input.nextDouble();

        if (valor1 < valor2) {

            System.out.print(valor2 + " | " + valor1);
        }
        else {

            System.out.print(valor1 + " | " + valor2);
        }
    }
}
