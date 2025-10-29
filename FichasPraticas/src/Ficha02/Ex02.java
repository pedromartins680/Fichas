package Ficha02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Salário após impostos");

        double salarioliquido, salariobruto;

        System.out.print("Introduza o seu salário bruto:");
        salariobruto = input.nextDouble();

        if (salariobruto <= 15000) {
            salarioliquido = salariobruto * 0.8;
            System.out.print("O salário liquido é: " + salarioliquido);
        }
        else {
            salarioliquido = salariobruto * 0.7;
            System.out.print("O Salário liquido é:" + salarioliquido);
        }

    }
}
