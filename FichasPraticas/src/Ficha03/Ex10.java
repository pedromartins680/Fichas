package Ficha03;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Introduza um número acima de 2: ");
        numero = input.nextInt();

        if (numero > 2) {

            while (numero >= 2 && numero < numero + 1) {

                System.out.println(numero);
                if (numero % 2 == 0) {
                    numero = numero - 2;
                } else {
                    numero = numero - 1;
                }

            }
        } else {
            System.out.println("Número inválido!");

        }
    }
}
