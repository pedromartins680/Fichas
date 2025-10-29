package Ficha02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_3 {

    public static void main(String[] args) {

        System.out.println("Ordem decrescente");

        Scanner input = new Scanner (System.in);

        int[] numeros = new int[4];

        for (int i=0; i<4; i++) {
            System.out.print("Introduza o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        Arrays.sort(numeros);

        for (int i = 3; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) System.out.print(" | ");
        }

    }
}
