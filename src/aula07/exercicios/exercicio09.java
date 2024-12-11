package aula07.exercicios;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a potência de um número!!!");

        System.out.println("Digite a base da potência ");
        int base = scanner.nextInt();
        System.out.println("Digite o expoente da potência: ");
        int expoente = scanner.nextInt();

        int potencia = calcularPotencia(base,expoente);
        System.out.println("A potência desse número é igual a " + potencia);

        scanner.close();
    }

    static int calcularPotencia (int base, int expoente) {
        int potencia = 1;

        for (int i = expoente; (1 <= i); i--) {
            potencia = base * potencia;
        }

        return potencia;
    }
}