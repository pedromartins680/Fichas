package Ficha05;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetor = new int [10];
        int menor =0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Introduza o valor para a posição " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }



        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }


        System.out.println("O menor número é: " + menor);


    }
}
