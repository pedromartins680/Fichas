package FichaExtra1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso;

        System.out.print("\nIntroduza o seu peso (em Kg.): ");
        peso = input.nextDouble();

        if (peso > 0) {

            System.out.print("Peso na lua: " + peso * 0.16 + " Kg.");

        }
    }
}
