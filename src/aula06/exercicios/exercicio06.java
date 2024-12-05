package aula06.exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrizInt = new int[2][2];

        for (int[] vetorInt : matrizInt) {
            for (int i = 0; i < vetorInt.length; i++) {
                System.out.println("Digite um número inteiro: ");
                vetorInt[i] = scanner.nextInt();
            }
        }
        for (int[] vetorInt : matrizInt) {
            for (int valorInt : vetorInt) {
                System.out.println(valorInt);
            }
        }


        scanner.close();
    }
}