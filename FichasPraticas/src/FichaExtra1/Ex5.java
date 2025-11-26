package FichaExtra1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 69;
        int numero;

        System.out.print("Adivinhe o número (de 1 a 100): ");
        numero = input.nextInt();

        if (numero < n) {

            System.out.println("Número muito baixo!");
            System.out.print("Tente adivinhar de novo: ");
            numero = input.nextInt();

            if (numero < n) {

                System.out.println("Número muito baixo!");
                System.out.println("Ficaste sem tentativas!");
            }


        }


        if (numero == n) {

            System.out.println("Acertaste!");
        }

    }
}
