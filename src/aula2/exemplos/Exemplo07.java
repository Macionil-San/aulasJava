package aula2.exemplos;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro:  ");

        int varInt= scanner.nextInt();
        short varShort = (short )varInt;
        byte varByte =  (byte )varShort;


        System.out.println("o número digitado é (INT) " + varInt);
        System.out.println("o número digitado é (SHORT) " + varShort);
        System.out.println("o número digitado é (BYTE) " + varByte);


        System.out.print("digite um número decimal:  ");
        double varDouble = scanner.nextDouble();
        float varFloat = (float) varDouble;

        System.out.println("o número digitado é (Double) " + varDouble);
        System.out.println("o número digitado é (Float) " + varFloat);

        scanner.close();

    }
}
