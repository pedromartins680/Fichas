package Ficha02;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Depositar/debitar saldo na sua conta");

        double valorconta, valor, resultado;

        System.out.print("Introduza o valor na conta: ");
        valorconta = input.nextDouble();

        System.out.print("Introduza o valor a depositar/debitar na conta: ");
        valor = input.nextDouble();

        resultado = valorconta + valor;

        if (resultado >= 0 && resultado > valorconta) {

            System.out.println("Depósito feito com sucesso!");
            System.out.println("Valor na conta: " + resultado);
        }

        if (resultado >= 0 && resultado < valorconta) {

            System.out.println("Levantamento feito com sucesso!");
            System.out.println("Valor na conta: " + resultado);
        }

        if (resultado < 0) {

            System.out.println("Saldo insuficiente!");
        }

        if ( resultado == valorconta) {

            System.out.println("Valor na conta: " + resultado);
            System.out.println("Nenhuma operação efetuada.");
        }





    }
}
