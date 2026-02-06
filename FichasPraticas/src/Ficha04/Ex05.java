package Ficha04;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.print("Selecione a opção pretendida: ");
            opcao = input.nextInt();

            System.out.println("-----------------------------------------------------------");

            switch (opcao) {

                case 1:
                    System.out.println("Selecionou a opção 1: Criar.");
                    break;

                case 2:
                    System.out.println("Selecionou a opção 2: Atualizar.");
                    break;

                case 3:
                    System.out.println("Selecionou a opção 3: Eliminar.");
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("-----------------------------------------------------------");


        } while (opcao > 0 && opcao < 4);
    }
}
