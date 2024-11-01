package aula02.Exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número inteiro:  ");
        short varShort = (short) scanner.nextInt();
        int varInt = varShort;
        byte varByte = (byte) varShort;


        System.out.println("o número digitado é " + varShort);
        System.out.println("o número digitado é (SHORT) " + varShort);
        System.out.println("o número digitado é (INT) " + varInt);
        System.out.println("o número digitado é (BYTE) " + varByte);

        scanner.close();
    }
}
