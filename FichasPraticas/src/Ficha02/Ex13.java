package Ficha02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.println("Conversão de horas em formato 24h para 12h");

        System.out.print("Introduza as horas: ");
        horas = input.nextInt();

        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        System.out.println("Formato 24h: " + horas + "h" + minutos);

        if (horas <= 12) {

            System.out.println("Após conversão: ");
            System.out.println("Formato 12h: " + horas + "h" + minutos + " AM");

        }

        if (horas > 12 && horas < 24) {

            horas = horas - 12;

            System.out.println("Após conversão: ");
            System.out.println("Formato 12h: " + horas + "h" + minutos + " PM");
        }

        if (horas == 24) {

            System.out.println("Após conversão: ");
            System.out.println("Formato 12h: 00h" + minutos + " AM");
        }


    }
}
