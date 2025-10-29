package Ficha02;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int posicao, pontos;

        System.out.println("Quantos pontos ganhaste dependendo da tua posição");

        System.out.print("Qual foi a sua posição? ");
        posicao = input.nextInt();

        if (posicao == 1) {

            pontos = 10;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 2) {

            pontos = 8;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 3) {

            pontos = 6;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 4) {

            pontos = 5;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 5) {

            pontos = 4;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 6) {

            pontos = 3;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 7) {

            pontos = 2;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao == 8) {

            pontos = 1;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

        if (posicao > 8) {

            pontos = 0;

            System.out.println("Ganhou: " + pontos + " pontos");
        }

    }
}
