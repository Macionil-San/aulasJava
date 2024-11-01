package aula04.exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanto tu trabaio???: ");
        int varHora = scanner.nextInt();

        System.out.println("quanto vc recebe por hora???: ");
        float valorHora = scanner.nextFloat();

        int horaEXtra = (varHora - 40) * 10;

        float valorExtra;

        if (varHora > 40) {
            valorExtra = (float) (horaEXtra + horaEXtra * 0.5);
            System.out.println("Voce recebeu " + valorExtra + " de extra");
        } else {
            System.out.println("VAI TRABAIA MAI, SE NÃO RECEBEU EXTRA");
        }


    }
}
