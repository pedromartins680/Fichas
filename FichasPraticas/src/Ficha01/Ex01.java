package Ficha01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calcular a soma de 2 números");

        int numero1, numero2, soma;

        System.out.print("Introduza o primeiro número:");
        numero1 = input.nextInt();

        System.out.print("Introduza o segundo número:");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);

    }
}
