package Ficha03;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, total, contador;
        total = 1;

        System.out.print("Introduza um número inteiro não negativo: ");
        numero = input.nextInt();

        while ( numero < 0 ) {

            System.out.print("Por favor introduza um número inteiro NÃO NEGATIVO: ");
            numero = input.nextInt();

        }

        contador = numero;

        while ( numero > 0) {

            total = total * numero;
            numero = numero - 1;
        }

        System.out.println("O fatorial de " + contador + " é: " + total);
    }
}
