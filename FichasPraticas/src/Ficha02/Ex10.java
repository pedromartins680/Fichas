package Ficha02;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Realize a operação desejada entre 2 números ");

        double valor1, valor2, resultado;
        String operacao;

        System.out.print("Introduza o primeiro número: ");
        valor1 = input.nextDouble();

        System.out.print("Introduza a operação aritmética pretendida(+, -, /, *, %): ");
        operacao = input.next();
        
        System.out.print("Introduza o segundo número:");
        valor2 = input.nextDouble();



        switch (operacao) {

            case "+":
                resultado = valor1 + valor2;
                System.out.print("A soma é: " + resultado);
                break;

            case "-":
                resultado = valor1 - valor2;
                System.out.print("A substração é: " + resultado);
                break;

            case "*":
                resultado = valor1 * valor2;
                System.out.print("A multiplicação é: " + resultado);
                break;

            case "/":
                resultado = valor1 / valor2;
                System.out.print("A divisão é: " + resultado);
                break;

            case "%":
                resultado = valor1 % valor2;
                System.out.print("O resto é: " + resultado);
                break;

            default:
                System.out.println("Operação não reconhecida!");
                break;

        }

    }
}
