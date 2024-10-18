package aula04.exemplo;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("digite um numero inteiro");
        x = scanner.nextInt();
        if (x >= 30) {
            System.out.println("O numero é maior ou igual a 30");
        } else {
            System.out.println("O numero é menor que 30");
        }
        scanner.close();
    }
}
