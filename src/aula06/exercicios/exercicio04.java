package aula06.exercicios;

import java.util.Scanner;

public class exercicio04 {


    public class Exercicio04_MediaNotas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double[] notas = new double[4];
            double media = 0;

            for (int i = 0; i < 4; i++) {
                System.out.println("Digite a nota " + i + ": ");
                notas[i] = scanner.nextDouble();
                media += notas[i];
            }
            media = media / notas.length;

            System.out.println("A média das notas é igual a " + media);

            scanner.close();
        }
    }
}