package Ficha02;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o menor número");

        int valor1, valor2, valor3;

        System.out.print("Introduza o primeiro número: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        valor2 = input.nextInt();

        System.out.print("Introduza o terceiro número: ");
        valor3 = input.nextInt();

        if ( valor1 < valor2 && valor2 < valor3) {

            System.out.print("O menor número é: " + valor1);
        }

        if ( valor2 < valor1 && valor1 < valor3) {

            System.out.print("O menor número é: " + valor2);
        }

        if ( valor3 < valor2 && valor2 < valor1) {

            System.out.print("O menor número é: " + valor3);
        }

    }
}
