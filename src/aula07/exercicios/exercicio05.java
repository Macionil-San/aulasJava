package aula07.exercicios;


import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1,nota2,nota3);
        System.out.println("A média das notas é igual a " + media);

        scanner.close();
    }

    static double calcularMedia (double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
