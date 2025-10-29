package Ficha02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Verificar se passou ao teste");

        int valor1, valor2, valor3;
        double ponderada;

        System.out.print("Introduza a nota do primeiro teste: ");
        valor1 = input.nextInt();

        System.out.print("Introduza a nota do segundo teste: ");
        valor2 = input.nextInt();

        System.out.print("Introduza a nota do terceiro teste: ");
        valor3 = input.nextInt();

        ponderada = (valor1 * 0.25) + (valor2 * 0.35) + (valor3 * 0.40);

        if ( ponderada > 9.5) {

            System.out.printf("O aluno aprovou com: %.0f", ponderada);
        }

        else {

            System.out.printf("O aluno reprovou com: %.0f", ponderada);
        }



    }
}
