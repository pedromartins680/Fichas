package Ficha03;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

       int numero, total;
       numero = 1;
       total = 0;



       while (numero > 0 && numero < 101) {

           System.out.println(numero);
           total = total + numero;
           numero = numero + 1;


       }

        System.out.println("O somatório é: " + total );

    }
}
