package aula2.exemplos;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número inteiro:  ");
        int varInt= scanner.nextInt();
        long varLong = varInt;
        float varFloat = varInt;


        System.out.println("o número digitado é " + varInt);
        System.out.println("o número digitado é (INT) " + varInt);
        System.out.println("o número digitado é (LONG) " + varLong);
        System.out.println("o número digitado é (FLOAT) " + varFloat);

        System.out.print("digite um número decimal:  ");
        varFloat = scanner.nextFloat();
        System.out.println("o número digitado é (FLOAT) " + varFloat);

        scanner.close();
    }
}

