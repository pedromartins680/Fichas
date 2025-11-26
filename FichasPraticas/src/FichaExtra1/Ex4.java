package FichaExtra1;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        String letra;


        System.out.print("Introduza uma letra do alfabeto: ");
        letra = input.next().toUpperCase();


        switch (letra) {

            case "A" :

                System.out.println("\nA letra " + letra + " é uma vogal.");
                break;

            case "E" :

                System.out.println("\nA letra " + letra + " é uma vogal.");
                break;

            case "I" :

                System.out.println("\nA letra " + letra + " é uma vogal.");
                break;

            case "O" :

                System.out.println("\nA letra " + letra + " é uma vogal.");
                break;

            case "U" :

                System.out.println("\nA letra " + letra + " é uma vogal.");
                break;


            default:

                System.out.println("\nA letra " + letra.toUpperCase() + " é uma consoante.");
                break;

        }


    }
}
