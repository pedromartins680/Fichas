package Ficha01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calulcar a soma, substração, multiplicação e divisão de 2 números");

        double numero1, numero2, soma, divisao, subtracao, multiplicacao;

        System.out.print("Insira um número:");
        numero1 = input.nextInt();

        System.out.print("Insira outro número:");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        divisao = numero1 / numero2;

        subtracao = numero1 - numero2;

        multiplicacao = numero1 * numero2;

        System.out.println("Soma= " + soma);
        System.out.println("Substração=" + subtracao);
        System.out.println("Multiplicação=" + multiplicacao);
        System.out.println("Divisão= " + divisao);

    }
}
