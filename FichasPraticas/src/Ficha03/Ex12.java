package Ficha03;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, grupo1, grupo2, grupo3, grupo4;
        grupo1 = 0;
        grupo2 = 0;
        grupo3 = 0;
        grupo4 = 0;

        System.out.println("Introduza um número: ");
        numero = input.nextInt();

        while (numero > 0) {

            if (numero > 0 && numero < 26) {

                grupo1 = grupo1 + 1;
            }

            if (numero > 25 && numero < 51) {

                grupo2 = grupo2 + 1;
            }

            if (numero > 51 && numero < 76) {

                grupo3 = grupo3 + 1;
            }

            if (numero > 75 && numero < 101) {

                grupo4 = grupo4 + 1;
            }
            System.out.println("Introduza um número: ");
            numero = input.nextInt();

        }
        System.out.println(" - [00,25]: " + grupo1);
        System.out.println(" - [26,50]: " + grupo2);
        System.out.println(" - [51,75]: " + grupo3);
        System.out.println(" - [76,100]: " + grupo4);
    }
}
