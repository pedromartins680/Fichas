package Ficha03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, valor, quantidade;
        double media;
        valor = 0;
        quantidade = 0;

        System.out.print("Introduza um número (-1 para parar): ");
        numero = input.nextInt();

        while ( numero != -1) {

            valor = valor + numero;
            quantidade = quantidade + 1;

            System.out.print("Introduza um número (-1 para parar): ");
            numero = input.nextInt();
        }

        media = (double) valor / quantidade;

        System.out.println("a média é: " + media);


    }
}
