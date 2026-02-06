package Funções;

import java.util.Scanner;

public class Ex02 {

    public static int MaisPequeno (int n1, int n2, int n3 ) {

        int num=0;

        if (n1 < n2 && n2 < n3) {

            num = n1;

        }

        if (n2 < n1 && n2 < n3) {

            num = n2;

        }

        if (n3 < n2 && n3 < n1) {

            num = n3;


        }
        return num;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Introduza o 1º número: ");
        n1 = input.nextInt();

        System.out.print("Introduza o 2º número: ");
        n2 = input.nextInt();

        System.out.print("Introduza o 3º número: ");
        n3 = input.nextInt();

        System.out.println();
        System.out.println("O número mais pequeno é: " + MaisPequeno(n1, n2, n3));


    }
}
