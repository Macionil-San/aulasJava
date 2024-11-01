package aula02.Exercicios;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número flacionado:  ");
        float varFloat = scanner.nextInt();
        long varLong = (long) varFloat;
        double varDouble = varLong;


        System.out.println("o número digitado é " + varFloat);
        System.out.println("o número digitado é (FLOAT) " + varFloat);
        System.out.println("o número digitado é (LONG) " + varLong);
        System.out.println("o número digitado é (DOUBLE) " + varDouble);


        scanner.close();

    }
}
