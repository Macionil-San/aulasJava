package aula02.Exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas:  ");

        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor de horas trabalhadas:  ");
        int valorPorHora = scanner.nextInt();

        System.out.println("O salário total é igual a: " + horasTrabalhadas * valorPorHora);

    }
}
