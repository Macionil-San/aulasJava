package aula05.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("qual o num: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " e primo.");
        } else {
            System.out.println(numero + " não e primo.");
        }

        scanner.close();
    }
}



