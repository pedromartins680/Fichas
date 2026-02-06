package Ficha05;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        int matriz [][] = new int [3][3];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print("Introduza o valor da linha " + (i + 1) + " e coluna " + (j + 1) +": " );
                matriz[i][j]= input.nextInt();

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }
    }
}
