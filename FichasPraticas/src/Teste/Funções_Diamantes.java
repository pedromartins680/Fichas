package Teste;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Funções_Diamantes {

    public static String[][] preencherMatriz(String[][] matriz) {

        Integer contador = 1;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                if (contador < 10) {
                    matriz[i][j] = "0" + contador.toString();
                    contador++;
                } else {
                    matriz[i][j] = contador.toString();
                    contador++;
                }
            }

        }
        return matriz;
    }

    public static String[][] imprimirMatriz(String[][] matriz) {

        System.out.println("------------------");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print("|" + matriz[i][j]);

            }

            System.out.println("\n------------------");

        }
        return matriz;
    }

    public static int[] diamantes(int[] vetor) {

        Random rd = new Random();
        int num;
        boolean existe = false;

        for (int i = 0; i < vetor.length; i++) {

            do {
                num = rd.nextInt(1, 37);
                existe = false;

                for (int j = 0; j < i; j++) {
                    if (num == vetor[j]) {
                        existe = true;
                        break;
                    }
                }
            } while (existe);

            vetor[i] = num;


        }
        return vetor;
    }

    public static String[][] jogador1(String[][] matriz, int[] vetor) {

        Scanner input = new Scanner(System.in);

        Integer num;
        boolean valido = false;
        boolean diamante = false;
        String numero = "";

        do {

            System.out.println("------------------");
            System.out.print("Escolha a posição em que quer jogar Jogador 1 ( 1 - 36 ): ");
            num = input.nextInt();

            int linha = (num - 1) / 6;
            int coluna = (num - 1) % 6;

            if (num < 10) {

                numero = "0" + num.toString();
            } else {

                numero = num.toString();
            }

            if (num < 1 || num > 36) {

                System.out.println("-----------------");
                System.out.println("Escolha uma posição válida! ( 1 - 36 )");


            }


            if (matriz[linha][coluna].equals("D1") || matriz[linha][coluna].equals("D2")) {

                System.out.println("-----------------");
                System.out.println("Diamante já encontrado, tenta outra posição!");

            }

            if (matriz[linha][coluna].equals("-X")) {

                System.out.println("-----------------");
                System.out.println("Esta posição já foi escolhida!");

            }

            if (matriz[linha][coluna].equals(numero)) {

                for (int i = 0; i < vetor.length; i++) {

                    if (num == vetor[i]) {

                        System.out.println("-----------------");
                        System.out.println("Diamante encontrado!");
                        diamante = true;
                        valido = true;
                        matriz[linha][coluna] = "D1";
                        break;
                    }
                }


            }
            if (!diamante && matriz[linha][coluna].equals(numero)) {

                System.out.println("-----------------");
                System.out.println("Nada aqui!");
                matriz[linha][coluna] = "-X";
                valido = true;
            }
        } while (!valido);

        return matriz;
    }

    public static String[][] jogador2(String[][] matriz, int[] vetor) {

        Scanner input = new Scanner(System.in);

        Integer num;
        boolean valido = false;
        boolean diamante = false;
        String numero = "";

        do {

            System.out.println("------------------");
            System.out.print("Escolha a posição em que quer jogar Jogador 2 ( 1 - 36 ): ");
            num = input.nextInt();

            int linha = (num - 1) / 6;
            int coluna = (num - 1) % 6;

            if (num < 10) {

                numero = "0" + num.toString();
            } else {

                numero = num.toString();
            }

            if (num < 1 || num > 36) {

                System.out.println("-----------------");
                System.out.println("Escolha uma posição válida! ( 1 - 36 )");


            }


            if (matriz[linha][coluna].equals("D1") || matriz[linha][coluna].equals("D2")) {

                System.out.println("-----------------");
                System.out.println("Diamante já encontrado, tenta outra posição!");

            }

            if (matriz[linha][coluna].equals("-X")) {

                System.out.println("-----------------");
                System.out.println("Esta posição já foi escolhida!");

            }

            if (matriz[linha][coluna].equals(numero)) {

                for (int i = 0; i < vetor.length; i++) {

                    if (num == vetor[i]) {

                        System.out.println("-----------------");
                        System.out.println("Diamante encontrado!");
                        diamante = true;
                        valido = true;
                        matriz[linha][coluna] = "D2";
                        break;
                    }
                }


            }
            if (!diamante && matriz[linha][coluna].equals(numero)) {

                System.out.println("-----------------");
                System.out.println("Nada aqui!");
                matriz[linha][coluna] = "-X";
                valido = true;
            }
        } while (!valido);

        return matriz;
    }

    public static boolean vitoria1(String[][] matriz) {

        int contador = 0;
        boolean ganhou = false;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j].equals("D1")) {

                    contador++;
                }
            }
        }

        if (contador > 2) {

            ganhou = true;
        }

        return ganhou;
    }

    public static boolean vitoria2(String[][] matriz) {

        int contador = 0;
        boolean ganhou = false;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j].equals("D2")) {

                    contador++;
                }
            }
        }

        if (contador > 2) {

            ganhou = true;
        }

        return ganhou;
    }
}



