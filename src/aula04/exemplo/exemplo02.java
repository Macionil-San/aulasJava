package aula04.exemplo;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String corSemafaro;

        System.out.println("como ta o semafaro? (verde) (amarelo) (vermelho): ");
        corSemafaro = scanner.next();

        if (corSemafaro.equals("verde") || corSemafaro.equals("Verde")) {
            System.out.println("Siga");

        } else if (corSemafaro.equals("vermelho") || corSemafaro.equals("Vermelho")) {
            System.out.println("Para ai negoo");

        } else if (corSemafaro.equals("amarelo") || corSemafaro.equals("Amarelo")) {
            System.out.println("Atenção ai nego");

        } else {
            System.out.println("que isso nego? " + corSemafaro + " não é cor de semafaro naum");
        }
    }
}
