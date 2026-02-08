package Teste;

import java.util.Scanner;

import static Teste.Funções_Diamantes.*;

public class ExercicioDiamantes {

    public static void Diamantes() {

        Scanner input = new Scanner(System.in);

        String[][] matriz = new String[6][6];
        int[] vetor = new int[5];
        boolean login = true;
        int opcao = 1;


        do {




            int jogador = 1;
            int vencedor = 0;
            int contador = 1;
            matriz = preencherMatriz(matriz);


            switch (opcao) {

                case 1:

                        vetor = diamantes(vetor);
                        System.out.println("------------------");

                        for (int i = 0; i < vetor.length; i++) {

                            System.out.print("|" + vetor[i] + "|");
                        }
                    System.out.println();
                    System.out.println("------------------");
                    System.out.println("Diamantes para facilitar a sua vida");

                    imprimirMatriz(matriz);

                    do {

                        if (jogador == 1) {

                            jogador1(matriz, vetor);
                            imprimirMatriz(matriz);
                            jogador++;
                            contador++;

                        } else if (jogador == 2) {

                            jogador2(matriz, vetor);
                            imprimirMatriz(matriz);
                            jogador--;
                            contador++;

                        }

                        if (vitoria1(matriz)) {

                            vencedor = 1;
                            System.out.println("-----------------");
                            System.out.println("Jogador 1 ganhou!");
                            break;
                        }

                        if (vitoria2(matriz)) {

                            vencedor = 2;
                            System.out.println("-----------------");
                            System.out.println("Jogador 2 ganhou!");
                            break;
                        }

                    } while (contador < 37);

                    if (!vitoria1(matriz) && !vitoria2(matriz)) {

                        System.out.println("-----------------");
                        System.out.println("Empate!");
                    }
                    break;

                case 9:

                    login = false;
                    break;

                default:
                    System.out.println("-----------------");
                    System.out.println("Escolha 1 ou 9!");

                    break;
            }

            if (!login) break;
            System.out.println("-----------------");
            System.out.println("Deseja jogar outra vez? ");
            System.out.println("1. Continuar");
            System.out.println("9. Sair");
            System.out.println("-----------------");
            opcao = input.nextInt();


        } while (login);
    }
}

