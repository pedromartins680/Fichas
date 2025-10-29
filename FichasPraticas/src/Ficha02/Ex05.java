package Ficha02;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero1, numero2;

        System.out.println("Ordem crescente");

        System.out.print("Introduza um número: ");
        numero1 = input.nextDouble();

        System.out.print("Introduza outro número:");
        numero2 = input.nextDouble();

        if ( numero1 < numero2) {

            System.out.println(numero1 + "|" + numero2 );
        }
        else {

            System.out.println(numero2 + "|" + numero1);
        }



    }
}
