package Ficha02;

import javax.crypto.spec.PSource;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("Opções:");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("Introduza a ação pretendida: ");
        opcao = input.nextInt();

        switch (opcao) {

            case 1:
                System.out.print("Selecionou a opção 1: Criar." );
                break;

            case 2:
                System.out.print("Selecionou a opção 2: Atualizar." );
                break;

            case 3:
                System.out.print("Selecionou a opção 3: Eliminar." );
                break;

            case 4:
                System.out.print("Selecionou a opção 4: Sair." );
                break;

            default:
                System.out.print("A opção selecionada é inválida.");
        }
    }
}
