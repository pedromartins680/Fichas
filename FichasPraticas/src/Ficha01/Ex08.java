package Ficha01;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calcular a duração total de 5 músicas");

        int m1m, m1s, m2m, m2s, m3m, m3s, m4m, m4s, m5m, m5s, totalminutos, totalsegundos, total, resto;

        System.out.print("Introduza os minutos da primeira música:");
        m1m = input.nextInt();

        System.out.print("Introduza os segundos da primeira música:");
        m1s = input.nextInt();

        System.out.print("Introduza os minutos da segunda música:");
        m2m = input.nextInt();

        System.out.print("Introduza os segundos da segunda música:");
        m2s = input.nextInt();

        System.out.print("Introduza os minutos da terceira música:");
        m3m = input.nextInt();

        System.out.print("Introduza os segundos da terceira música:");
        m3s = input.nextInt();

        System.out.print("Introduza os minutos da quarta música:");
        m4m = input.nextInt();

        System.out.print("Introduza os segundos da quarta música:");
        m4s = input.nextInt();

        System.out.print("Introduza os minutos da quinta música:");
        m5m = input.nextInt();

        System.out.print("Introduza os segundos da quinta música:");
        m5s = input.nextInt();

        totalminutos = (m1m * 60) + (m2m * 60) + (m3m * 60) + (m4m * 60) + (m5m * 60);
        totalsegundos = totalminutos + m1s + m2s + m3s + m4s + m5s;
        total = totalsegundos / 60;
        resto = totalsegundos % 60;

        System.out.println("O total dá: " + total + "minutos e " + resto + "segundos.");






    }
}
