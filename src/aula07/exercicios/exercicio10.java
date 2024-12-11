package aula07.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura ");
        double altura = scanner.nextDouble();

        double IMC = calcularIMC(peso,altura);
        System.out.println("Seu IMC é " + IMC);

        scanner.close();
    }

    static double calcularIMC (double peso, double altura) {
        return peso / (altura * altura);
    }
}