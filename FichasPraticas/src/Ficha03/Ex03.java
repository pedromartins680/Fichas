package Ficha03;

public class Ex03 {

    public static void main(String[] args) {

        System.out.println("Ímpares de 531 a 750");

        int numero;
        numero = 531;

        while (numero > 530 && numero < 751) {

            if ( numero % 2 != 0) {

                System.out.println(" - " + numero);
            }
            numero = numero + 1;
        }
    }
}
