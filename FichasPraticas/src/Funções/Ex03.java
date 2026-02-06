package Funções;

import java.util.Scanner;

public class Ex03 {

    public static double MediaAritmetica (double n1, double n2, double n3) {

        double num = 0;

        num = (n1 + n2 + n3)/3;
        return num;
    }

    public static void main(String[] args) {


        double n1, n2, n3;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o 1º número: ");
        n1 = input.nextInt();

        System.out.print("Introduza o 2º número: ");
        n2 = input.nextInt();

        System.out.print("Introduza o 3º número: ");
        n3 = input.nextInt();

        System.out.println("A média aritmética é: " + MediaAritmetica(n1, n2, n3));

    }
}
