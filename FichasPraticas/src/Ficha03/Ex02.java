package Ficha03;

public class Ex02 {

    public static void main(String[] args) {

        System.out.println("Números pares de 1 a 400");

        int numero;
        numero = 1;

        while ( numero > 0 && numero < 401) {

            if (numero % 2 == 0) {

                System.out.println(" - " + numero);
            }
            numero = numero + 1;
        }
    }
}
