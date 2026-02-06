package FichaEx2;

public class Ex03 {

    public static void main(String[] args) {

        int contador = 1;
        int i = 1;

        while (i < 11 && contador < 11) {

            System.out.println(contador + " x " + i + " = " + (contador * i));
            i ++;

            if (i == 11) {

                contador ++;
                i = 0;
                System.out.println("-----------------------------------------------------");
            }
        }

    }
}
