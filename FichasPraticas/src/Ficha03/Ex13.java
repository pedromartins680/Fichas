package Ficha03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Introduza o 1º número: ");
        numero1 = input.nextInt();

        System.out.print("Introduza o 2º número: ");
        numero2 = input.nextInt();

        if ( numero1 > numero2) {

            while ( numero2 <= numero1) {

                if ( numero2 % 5 == 0) {
                    System.out.println(numero2);
                }
                    numero2 = numero2 + 1;

            }
        }

        if ( numero1 < numero2) {

            while ( numero1 <= numero2) {

                if ( numero1 % 5 == 0) {
                    System.out.println(numero1);
                }
                numero1 = numero1 + 1;

            }
        }

    }
}
