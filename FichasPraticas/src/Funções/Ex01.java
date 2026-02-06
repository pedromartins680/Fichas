package Funções;


import java.util.Scanner;

public class Ex01 {

    public static void Asteriscos(int num) {

        for (int i = 0; i < num; i++) {

            System.out.print("*");

        }

    }

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Introduza um número: ");
            num = input.nextInt();
        } while (num <= 0);

        System.out.println();

        Asteriscos(num);


    }
}
