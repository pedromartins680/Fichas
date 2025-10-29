package Ficha01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo da área e perímetro de um rectângulo");

        double lado1, lado2, area, perimetro;
        String medida;

        System.out.print("Introduza a unidade de medida:");
        medida = input.next();

        System.out.print("Lado 1:");
        lado1 = input.nextInt();

        System.out.print("Lado 2:");
        lado2 = input.nextInt();

        area = lado1 * lado2;
        perimetro = (lado1 * 2) + (lado2 * 2);

        System.out.println("A àrea é: " + area + medida + "^2");
        System.out.println("O perímetro é: " + perimetro + medida);


    }
}
