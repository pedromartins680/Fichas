package Ficha04;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2, contador;
        contador = 0;

        System.out.print("Jogador 1 introduza um número entre 0 a 100: ");
        numero1 = input.nextInt();

        while (numero1 < 0 || numero1 > 100) {
            System.out.print("Jogador 1 introduza um número ENTRE 0 a 100 INCLUSIVE: ");
            numero1 = input.nextInt();
        }

        do {

            System.out.print("Jogador 2 tente adivinhar o número: ");
            numero2 = input.nextInt();

            if (numero2 > numero1) {
                System.out.println("O número é menor!");
            }

            if (numero2 < numero1) {
                System.out.println("O número é maior!");
            }

            contador = contador + 1;

        } while (numero2 != numero1);


        System.out.println("----------------------------------------------------");
        System.out.println("Acertou! O número é: " + numero1);
        System.out.println("Precisou de " + contador + " tentativas");
        System.out.println("----------------------------------------------------");


    }
}
