package Funções;

import java.util.Scanner;

public class Ex04 {

    public static double AreaRectangulo (double ladoA, double ladoB) {

        double area = 0;

        area = ladoA * ladoB;

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ladoA, ladoB;

        System.out.print("Introduza um lado: ");
        ladoA = input.nextDouble();

        System.out.print("Introduza o outro lado: ");
        ladoB = input.nextDouble();

        System.out.println("A área do rectângulo é: " + AreaRectangulo(ladoA, ladoB));
    }
}
