package Ficha02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] valor = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduza o número " + (i + 1) + ": ");
            valor[i] = input.nextInt();
        }

        Arrays.sort(valor);

        System.out.println(valor[0] + " é o menor número");

    }
}
