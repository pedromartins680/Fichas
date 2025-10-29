package Ficha02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Determinar se um número é par ou ímpar");

        System.out.print("Introduza o número: ");
        valor = input.nextInt();;

        if ( valor % 2 == 0 ) {

            System.out.print(valor + " é par");

        }

        else {

            System.out.print(valor + " é ímpar");
        }
    }
}
