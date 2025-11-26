package FichaExtra1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("\nIntroduza a sua idade: ");
        idade = input.nextInt();

        if ( idade >= 18 ) {

        System.out.println("\n--------------------------------------------------");

        System.out.println("\nÉ maior de idade.\n");

        System.out.println("--------------------------------------------------");

    } else {

            System.out.println("\n--------------------------------------------------");

            System.out.println("\nÉ menor de idade.\n");

            System.out.println("--------------------------------------------------");

        }


        }
}
