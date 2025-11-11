package Ficha03;

import java.util.Scanner;

public class Ex15_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, total, contador, contador2, contador3, contador4;

        System.out.print("Introduza um número inteiro não negativo: ");
        numero = input.nextInt();

        while (numero < 0) {

            System.out.print("Por favor introduza um número inteiro NÃO NEGATIVO: ");
            numero = input.nextInt();

        }

        contador = 1;
        contador2 = 1;
        contador3 = 2;
        total = 1;
        contador4 = 1;

        while ( contador < numero ) {

            while ( contador2 < contador3) {

                total = total + contador4;
                contador2 = contador2 + 1;
            }

            contador2 = 1;
            contador3 = contador3 + 1;
            contador = contador + 1;
            contador4 = total;


        }

        System.out.println(total);

    }
}