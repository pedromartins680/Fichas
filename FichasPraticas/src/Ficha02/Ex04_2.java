package Ficha02;

import java.util.Scanner;

public class Ex04_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lugar, pontos;

        System.out.print("Qual foi a sua posição no torneio? ");
        lugar = input.nextInt();


        switch (lugar) {

            case 1: System.out.println("Ganhou 10 pontos.");
            break;

            case 2: System.out.println("Ganhou 8 pontos.");
            break;

            case 3: System.out.println("Ganhou 6 pontos.");
            break;

            case 4: System.out.println("Ganhou 5 pontos.");
            break;

            case 5: System.out.println("Ganhou 4 pontos.");
            break;

            case 6: System.out.println("Ganhou 3 pontos.");
            break;

            case 7: System.out.println("Ganhou 2 pontos.");
            break;

            case 8: System.out.println("Ganhou 1 ponto.");
            break;

            default: System.out.println("Ganhou 0 pontos.");
        }

    }
}
