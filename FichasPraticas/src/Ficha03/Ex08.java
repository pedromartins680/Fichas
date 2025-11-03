package Ficha03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, valor;


        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        valor = numero;


        System.out.println("Números - 5:");
        while ( valor < numero + 1 && valor > numero -5 ) {

            valor = valor - 1;
            System.out.println(valor);
        }

        valor = valor + 5;


        System.out.println("Números + 5:");
        while ( valor > numero - 1 && valor < numero +5 ) {

            valor = valor + 1;
            System.out.println(valor);
        }



    }
}
