package Ficha02;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor, notas200, notas100, notas50, notas20, notas10, notas5;

        System.out.print("Introduza um valor em euros múltiplo de 5: ");
        valor = input.nextInt();

        if(valor / 200 >= 1) {

            notas200 = valor / 200;
            valor = valor - (200*notas200);
            if (notas200 == 1) {
                System.out.println(notas200 + " nota de 200");
            }
            if (notas200 > 1) {
                System.out.println(notas200 + " notas de 200");
            }

        }

        if(valor / 100 >= 1) {

            notas100 = valor / 100;
            valor = valor - (100*notas100);
            if (notas100 == 1) {
                System.out.println(notas100 + " nota de 100");
            }
            if (notas100 > 1) {
                System.out.println(notas100 + "notas de 100");
            }

        }

        if(valor / 50 >= 1) {

            notas50 = valor / 50;
            valor = valor - (50*notas50);
            if (notas50 == 1) {
                System.out.println(notas50 + " nota de 50");
            }
            if (notas50 > 1) {
                System.out.println(notas50 + "notas de 50");
            }

        }

        if(valor / 20 >= 1) {

            notas20 = valor / 20;
            valor = valor - (20*notas20);
            if (notas20 == 1) {
                System.out.println(notas20 + " nota de 20");
            }
            if (notas20 > 1) {
                System.out.println(notas20 + "notas de 20");
            }

        }

        if(valor / 10 >= 1) {

            notas10 = valor / 10;
            valor = valor - (10*notas10);
            if (notas10 == 1) {
                System.out.println(notas10 + " nota de 10");
            }
            if (notas10 > 1) {
                System.out.println(notas10 + "notas de 10");
            }
            }

        if(valor / 5 >= 1) {

            notas5 = valor / 5;
            valor = valor - (5*notas5);
            if (notas5 == 1) {
                System.out.println(notas5 + " nota de 5");
            }
            if (notas5 > 1) {
                System.out.println(notas5 + "notas de 5");
            }

        }

    }
}
