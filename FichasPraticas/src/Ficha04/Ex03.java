package Ficha04;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Introduza um valor: ");
        numero = input.nextInt();

        for (int i = numero; i>0; i--) {

            if (numero % i == 0) {

                System.out.println(i);
            }
        }
    }
}
