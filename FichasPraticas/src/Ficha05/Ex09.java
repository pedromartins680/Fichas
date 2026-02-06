package Ficha05;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        int total = 0;

        int matriz [][] = new int [5][5];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print("Introduza o valor da linha " + (i + 1) + " e coluna " + (j + 1) +": " );
                matriz[i][j]= input.nextInt();

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + " ");
                total = total + matriz[i][j];

            }

            System.out.println();
        }

        System.out.println("---------------------------------------");
        System.out.println("A soma é: " + total);
        System.out.println("---------------------------------------");
    }
}


