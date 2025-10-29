package Ficha01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area;
        final double pi;
        pi= Math.PI;
        String medida;

        System.out.println("Calcular a área de uma circunferência ");

        System.out.print("Introduza a unidade de medida:");
        medida = input.next();

        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        area = (raio * raio) * pi;

        System.out.printf("A área é: %.2f", area);
        System.out.print(medida + "^2");

    }
}
