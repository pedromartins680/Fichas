package Ficha03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidade, contador, numero, numero2;
        contador = 1;
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir: ");
        quantidade = input.nextInt();

        if ( quantidade <= 0) {

            System.out.println("Por favor introduza uma quantidade acima de 0!");
        }

        System.out.print("Introduza um número: ");
        numero = input.nextInt();



        while (contador < quantidade) {

            System.out.print("Introduza um número:");
            numero2 = input.nextInt();

            if (numero2 <= numero) {
                crescente = false;

            }
            contador = contador + 1;
            numero = numero2;
        }

        if (crescente) {
            System.out.println("É crescentre!");

        } else {
            System.out.println("Não é crescente!");
        }
    }
}
