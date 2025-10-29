package Ficha02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int[] numeros= new int[4];

        System.out.println("Valor do maior para o mais pequeno");

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduza o número " + (i +1) + ": ");
            numeros[i] = input.nextInt();
        }

        Arrays.sort(numeros);

        System.out.print("Ordem crescente: ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) System.out.print(" | ");
        }

    }
}
