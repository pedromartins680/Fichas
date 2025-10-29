package Ficha01;

import java.util.Scanner;

public class Ex0602 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Permutação de 2 valores:");

        int valor1, valor2;

        System.out.print("Introduza o valor 1:");
        valor1 = input.nextInt();

        System.out.print("Introduza o valor 2:");
        valor2 = input.nextInt();

        System.out.println("O valor 1 é:" + valor1);
        System.out.println("O valor 2 é:" + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("Após a permutação");
        System.out.println("O valor 1 é:" + valor1);
        System.out.println("O valor 2 é:" + valor2);


    }
}
