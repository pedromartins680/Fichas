package Ficha03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Todos os números até o número introduzido");

        int numero, valor;
        valor = 0;

        System.out.print("Introduza o número: ");
        numero = input.nextInt();

        while ( valor < numero + 1 ) {

            System.out.println(valor);
            valor = valor + 1;
        }
    }
}
