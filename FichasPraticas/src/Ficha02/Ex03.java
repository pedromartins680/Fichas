package Ficha02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo do salário anual após impostos");

        double salariobruto, salarioliquido;

        System.out.print("Introduza o seu salário anual:");
        salariobruto = input.nextDouble();

        if (salariobruto < 15000) {

            salarioliquido = salariobruto * 0.8;

            System.out.printf("O salário líquido é: %.2f", salarioliquido);

        }

        if (salariobruto >= 15000 && salariobruto < 20000) {

            salarioliquido = salariobruto * 0.7;

            System.out.printf("O salário líquido é: %.2f", salarioliquido);

        }

        if ( salariobruto >= 20000 && salariobruto < 25000) {

            salarioliquido= salariobruto * 0.65;

            System.out.printf("O salário líquido é: %.2f", salarioliquido);

        }

        if (salariobruto >= 25000) {

            salarioliquido = salariobruto * 0.6;

            System.out.printf("O salário líquido é: %.2f", salarioliquido);
        }


    }
}
