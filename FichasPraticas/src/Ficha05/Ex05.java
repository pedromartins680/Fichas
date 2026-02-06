package Ficha05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor [] = new int [10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Introduza o valor para a posição " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        double total = 0;

        for (int i = 0; i < vetor.length; i++) {

            total = total + vetor[i];

        }

        System.out.println("A média é: " + (total/ vetor.length));

    }
}
