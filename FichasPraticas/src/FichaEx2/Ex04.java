package FichaEx2;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao = 1, contador1 = 1, contador2 = 1, quantidade = 2, valor1 = 2, valor2 = 5;

        while (opcao != -1) {

            System.out.print("Escolha qual programa quer executar 1, 2 ou 3 (-1 para sair): ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    while (contador2 < 5) {

                        System.out.print("*");
                        contador1++;

                        if (contador1 == 10) {
                            System.out.println();
                            contador2++;
                            contador1 = 1;
                        }
                    }
                    contador2 = 1;
                    break;

                case 2:

                    while (contador2 < 6) {

                        System.out.print("*");
                        contador1++;

                        if (contador1 == quantidade) {

                            quantidade++;
                            System.out.println();
                            contador2++;
                            contador1 = 1;
                        }
                    }
                    contador2 = 1;
                    break;

                case 3:

                    while (contador2 < 6) {

                        while (contador1 < valor2) {
                            System.out.print(" ");
                            contador1++;
                        }

                        contador1 = 1;
                        valor2 -= 1;


                        while (contador1 < valor1) {

                            System.out.print("*");
                            contador1++;
                        }

                        contador2++;
                        valor1+=2;
                        System.out.println();
                        contador1 = 1;
                    }


            }
            contador2 = 1;
            contador1 = 1;
            valor1 = 1;
            valor2 = 5;
        }
    }
}