package Ficha03;


import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Imprimir uma mensagem X vezes");

        int numero, valor;
        String mensagem;
        valor = 0;

        System.out.print("Quantas vezes quer imprimir? ");
        numero = input.nextInt();

        System.out.print("Escreva a mensagem pretendida: ");
        input.nextLine();
        mensagem = input.nextLine();



        while ( valor >= 0 && valor < numero) {

            System.out.println(mensagem);
            valor = valor + 1;
        }
    }


}
