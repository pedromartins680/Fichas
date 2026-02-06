package Funções;

public class Ex06 {

    public static boolean Par(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Positivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Primo(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Perfeito(int num) {

        int contador=0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {

               contador=contador+i;

            }
        }

        if (contador==num){
            return true;
        } else {
            return false;
        }

    }

    public static boolean Triangular (int num) {

        int soma=0;

        for (int i = 1; soma < num ; i++) {

            soma = soma + i;

        }

        if (soma==num){
            return true;
        } else {
            return false;
        }
    }
}
