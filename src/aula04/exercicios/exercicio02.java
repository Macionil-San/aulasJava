package aula04.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor;

        System.out.println("Qual o valor: ");
        valor = scanner.nextInt();

        if (valor > 100) {
            System.out.println("parabens se conseguiu desconto de " + valor * 0.1 + " agora o valor total é: " + (valor - valor * 0.1));
        }
        else {
            System.out.println("sem desconto total, igual a: " +valor );
        }
    }
}
