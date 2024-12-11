package aula05.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; /*interromper quando tiver número negativo*/
            }

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        scanner.close();
    }
}