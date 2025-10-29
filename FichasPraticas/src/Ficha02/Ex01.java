package Ficha02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indicar qual de 2 valores é o maior");

        double numero1, numero2;

        System.out.print("Introduza o numero 1:");
        numero1 = input.nextDouble();

        System.out.print("Introduza o numero 2:");
        numero2 = input.nextDouble();

        if (numero1 < numero2) {
            System.out.println("O número maior é:" + numero2);
        }
        else
        {
            System.out.println("O número maior é: " + numero1);
        }
    }
}
