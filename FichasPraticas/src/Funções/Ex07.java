package Funções;

import java.lang.reflect.Parameter;
import java.util.Scanner;

import static Funções.Ex06.*;

public class Ex07 {

    public static void main(String[] args) {

        int opcao, num;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        num = input.nextInt();
        do {


            System.out.println("---------------------------------");
            System.out.println("Escolha 1 das seguintes opções: ");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou negativo");
            System.out.println("3. Primo ou não primo");
            System.out.println("4. Perfeito ou não perfeito");
            System.out.println("5. Triangular ou não triangular");
            System.out.println("6. Trocar de número:");
            System.out.println("0. Sair");
            System.out.println("---------------------------------");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    if (Par(num)) {
                        System.out.println("O número é par.");
                    } else {
                        System.out.println("O número é ímpar.");
                    } break;

                case 2:
                    if (Positivo(num)) {
                        System.out.println("O número é positivo.");
                    } else {
                        System.out.println("O número é negativo.");
                    } break;

                case 3:
                    if (Primo(num)) {
                        System.out.println("O número é primo.");
                    } else {
                        System.out.println("O número não é primo.");
                    } break;

                case 4:
                    if (Perfeito(num)) {
                        System.out.println("O número é perfeito.");
                    } else {
                        System.out.println("O número não é perfeito.");
                    } break;

                case 5:
                    if (Triangular(num)) {
                        System.out.println("O número é triangular.");
                    } else {
                        System.out.println("O número não é triangular.");
                    } break;

                case 6:

                    System.out.println("Introduza o novo número:");
                    num = input.nextInt();
                    break;

                default:
                    System.out.println("Introduza uma opção válida!");
                    break;

            }

        } while (opcao != 0);
    }
}
