package Ficha03;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, salto, valor;
        valor = 0;

        System.out.print("Introduza o valor limite: ");
        numero = input.nextInt();

        System.out.println("Introduza o valor dos saltos pretendido: ");
        salto = input.nextInt();

        if (salto > 0) {

            while (valor < numero + 1) {

                System.out.println(valor);
                valor = valor + salto;
            }
            while (valor > numero -1) {
                System.out.println(valor);
                valor = valor - salto;
            }
        }
        else {
            System.out.println("O salto tem de ser maior que 0!");
        }
    }
}
