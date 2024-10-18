package aula2.Exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("qual a nota da primeira prova: ");
        int nota1 = scanner.nextInt();

        System.out.print(" a nota da segunda prova: ");
        int nota2 = scanner.nextInt();

        System.out.print("Informe a nota da terceira prova: ");
        int nota3 = scanner.nextInt();

        int somaNotas = nota1 + nota2 + nota3;
        System.out.println("A soma total das notas é: " + somaNotas);

        scanner.close();
    }
}