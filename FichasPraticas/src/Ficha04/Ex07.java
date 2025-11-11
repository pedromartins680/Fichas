package Ficha04;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, contador, numero2, contador2;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        contador = numero;
        numero2 = numero;
        contador2 = 0;


        while (contador > 0) {

            if (numero % numero2 == 0) {

                contador2 = contador2 + 1;

            }

            numero2 = numero2 - 1;
            contador = contador - 1;

        }

        if (contador2 == 2) {

            System.out.println("O número é primo!");
        } else {

            System.out.println("O número não é primo!");
        }

    }
}
