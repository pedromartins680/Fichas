package Ficha04;

public class Ex02 {

    public static void main(String[] args) {

        int total = 0;

        for (int i = 11; i <= 51; i += 2) {

            System.out.println(i);
            total = total + i;
        }
        System.out.println("O total é: " + total);

    }

}
