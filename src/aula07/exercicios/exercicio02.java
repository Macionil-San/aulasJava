package aula07.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numero 1: ");
        int num1 = scanner.nextInt();
        System.out.println("numero 2: ");
        int num2 = scanner.nextInt();

        int retorno = somar(num1, num2);
        System.out.println("SOMA = "+retorno);
    }

    private static int somar(int num01, int num02) {
        return num01 + num02;

    }
}
