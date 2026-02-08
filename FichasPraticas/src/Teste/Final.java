package Teste;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        boolean login = true;

        do {

            System.out.println("Qual é o jogo que quer jogar?");
            System.out.println("1. Jogo do galo");
            System.out.println("2. Descobrir os diamantes");
            System.out.println("9. Sair");
            num = input.nextInt();

            switch (num) {

                case 1: ExercicioGalo.Galo();
                break;

                case 2: ExercicioDiamantes.Diamantes();
                break;

                case 9:
                    login = false;
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        } while (login);

    }
}
