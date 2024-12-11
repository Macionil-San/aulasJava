package aula07.exercicios;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = scanner.nextInt();
        boolean verificacao = verificarPar(numero);

        System.out.println("O número é par: " + verificacao);

        scanner.close();
    }

    static boolean verificarPar (int num) {
        boolean verificacao;
        if (num % 2 == 0) {
            verificacao = true;
        } else {
            verificacao = false;
        }
        return verificacao;
    }
}