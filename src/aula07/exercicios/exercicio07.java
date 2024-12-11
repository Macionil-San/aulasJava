package aula07.exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = scanner.nextInt();
        System.out.println("Digite um número");
        int num2 = scanner.nextInt();
        System.out.println("Digite um número");
        int num3 = scanner.nextInt();

        int maior = maiorNumero(num1,num2,num3);
        System.out.println("O maior número desses é " + maior);

        scanner.close();
    }

    static int maiorNumero (int num1, int num2, int num3) {
        int[] numeros = {num1,num2,num3};
        int maiorValor = 0;

        for (int numero : numeros) {
            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }

        return maiorValor;
    }
}