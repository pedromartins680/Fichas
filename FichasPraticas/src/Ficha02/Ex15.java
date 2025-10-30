package Ficha02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha se quer ordem crescente ou decrescente de 3 números");

        int[] numeros = new int[3];
        String ordem;

        for (int i=0 ; i<3 ; i++) {
            System.out.print("Introduza o " + (i+1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        //Limpar o buffer do Scanner
        input.nextLine();

        Arrays.sort(numeros);

        System.out.print("Deseja ordem crescente: C ou decrescente: D? ");
        ordem = input.nextLine().toLowerCase().replace(" ","");

        if ( ordem.equals("c") || ordem.startsWith("crescente") || ordem.contains("ordemcrescente")) {
            ordem = "C";
        }

        else if (ordem.equals("d") || ordem.startsWith("decrescente") || ordem.contains("ordemdecrescente")) {
            ordem = "D";
        }


        switch (ordem) {

            case "C": for (int i=0; i<3; i++) {
                System.out.print(numeros[i]);
                if (i < 2) System.out.print(" | ");
            }
            break;


            case "D": for (int i=2; i>=0; i--) {
                System.out.print(numeros[i]);
                if (i > 0) System.out.print(" | ");
            }
            break;

            default:
                System.out.print("Opção inválida!");
        }


    }
}
