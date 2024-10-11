package aula2.Exercicios;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro:  ");

        int varInt = scanner.nextInt();
        short varShort = (short) varInt;
        byte varByte = (byte) varShort;


        System.out.println("o número digitado é " + varInt);
    }
}