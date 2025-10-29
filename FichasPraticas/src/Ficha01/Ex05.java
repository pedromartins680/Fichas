package Ficha01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calcular a média aritmética e ponderada de 3 números:");

        double numero1, numero2, numero3, aritmetica, ponderada;

        System.out.print("Introduza o primeiro número:");
        numero1 = input.nextDouble();

        System.out.print("Introduza o segundo número:");
        numero2 = input.nextDouble();

        System.out.print("Introduza o terceiro número:");
        numero3 = input.nextDouble();

        aritmetica = (numero1 + numero2 + numero3) / 3;
        ponderada = (numero1 * 0.2) + (numero2 * 0.3) + (numero3 * 0.5);

        System.out.printf("A média aritmética é: %.2f%n", aritmetica);
        System.out.printf("A média ponderada é: %.2f%n", ponderada);


    }
}
