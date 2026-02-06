package Ficha04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2, resultado;
        String operacao, continuar;
        Boolean s = true;

        do {

            System.out.print("Introduza o primeiro número: ");
            numero1 = input.nextInt();

            System.out.print("Introduza a operação pretendida (+, -, /, *): ");
            operacao = input.next();

            System.out.print("Introduza o segundo número: ");
            numero2 = input.nextInt();

            switch (operacao) {

                case "+":
                    resultado = numero1 + numero2;
                    System.out.println("A soma é: " + resultado);
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    System.out.println("A subtração é: " + resultado);
                    break;

                case "/":
                    resultado = numero1 / numero2;
                    System.out.println("A Divisão é: " + resultado);
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    System.out.println("A Multiplicação é: " + resultado);
                    break;

                default:
                    System.out.println("Operação inválida!");


            }

            System.out.println("Deseja continuar? (s / n)");
            continuar = input.next().toLowerCase();

            if (continuar.equals("n")) {
                s = false;
            }


        } while (s);
    }
}
