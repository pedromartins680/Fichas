package Ficha03;

public class Ex01 {

    public static void main(String[] args) {

        System.out.println("Números de 1 a 250");

        int numeros;
        numeros = 1;

        while (numeros > 0 && numeros < 251) {

            System.out.println(" - " +numeros);
            numeros = numeros + 1;

        }
    }
}
