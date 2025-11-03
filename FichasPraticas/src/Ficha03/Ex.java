package Ficha03;

import java.util.Scanner;

public class Ex{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, total, contador, contador2;
        total = 0;

        System.out.print("Introduza um número inteiro não negativo: ");
        numero = input.nextInt();

        while (numero < 0) {

            System.out.print("Por favor introduza um número inteiro NÃO NEGATIVO: ");
            numero = input.nextInt();

        }

        contador = 1;


            while (contador < numero) {

                total = total + numero;
                contador = contador + 1;
            }


        System.out.println(total);
    }
}
