package aula07.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em graus Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println(fahrenheit + " graus Fahrenheit");

        scanner.close();
    }

    private static double converterCelsiusParaFahrenheit(double conversao) {
        return conversao * 1.8 + 32;
    }
}