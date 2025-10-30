package Ficha02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ordenar 3 número na ordem crescente");

        int[] numero = new int[3];

        for (int i=0; i<3; i++) {

            System.out.print("Introduza o " + (i+1) + "º número: ");
            numero[i] = input.nextInt();
        }

        Arrays.sort(numero);

        for (int i=0; i<3; i++) {
            System.out.print(numero[i]);
            if (i < 2) System.out.print(" | ");
        }


    }
}
