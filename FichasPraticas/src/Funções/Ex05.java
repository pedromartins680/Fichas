package Funções;


import java.util.Scanner;

public class Ex05 {

    public static void Tabuada (int num) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " * " + i + " = " + (num*i) );

        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        Tabuada(num);
    }
}
