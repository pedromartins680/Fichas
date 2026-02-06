package Ficha05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor [] = new int [10];
        int atual, maior = -1;

        for (int i = 0; i < vetor.length ; i++) {
            System.out.print("Introduza o valor para a posição " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
            if (vetor[i] % 2 == 0) {
                maior = vetor [i];
        }
            }



        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                atual = vetor [i];

                if ( atual > maior) {

                    maior = atual;
                }
            }
        }

        if ( maior != -1) {
            System.out.println("O maior número par é: " + maior);
        } else {

            System.out.println("Nenhum número par foi inserido!");
        }

    }
}
