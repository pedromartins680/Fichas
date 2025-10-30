package Ficha02;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Colocar 3 números na ordem crescente");

        double valor1, valor2, valor3;

        System.out.print("Introduza o 1º número: ");
        valor1 = input.nextDouble();

        System.out.print("Introduza o 2º número: ");
        valor2 = input.nextDouble();

        System.out.print("Introduza o 3º número: ");
        valor3 = input.nextDouble();

        if ( valor1 < valor2 && valor2 < valor3) {

            System.out.println(valor1 + " | " + valor2 + " | " + valor3);
        }

        if ( valor1 < valor3 && valor3 < valor2) {

            System.out.println(valor1 + " | " + valor3 + " | " + valor2);
        }

        if ( valor2 < valor1 && valor1 < valor3) {

            System.out.println(valor2 + " | " + valor1 + " | " + valor3);
        }

        if ( valor2 < valor3 && valor3 < valor1) {

            System.out.println(valor2 + " | " + valor3 + " | " + valor1);
        }

        if ( valor3 < valor1 && valor1 < valor2) {

            System.out.println(valor3 + " | " + valor1 + " | " + valor2);
        }

        if ( valor3 < valor2 && valor2 < valor1) {

            System.out.println(valor3 + " | " + valor2 + " | " + valor1);
        }
    }
}
