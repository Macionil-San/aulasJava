package aula06.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizInt = new int[3][3];
        int maiorValor = 0;

        for (int[] vetorInt : matrizInt) {
            for (int i = 0; i < vetorInt.length; i++) {
                System.out.println("Digite um número inteiro: ");
                vetorInt[i] = scanner.nextInt();
            }
        }
        for (int[] vetorInt : matrizInt) {
            for (int valorInt : vetorInt) {
                if (valorInt > maiorValor) {
                    maiorValor = valorInt;
                }
            }
        }
        System.out.println("O maior número da matriz é " + maiorValor);

        scanner.close();
    }
}