package aula04.exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quantos contos tiene: ");
        float num = scanner.nextFloat();


        int opcao;

        System.out.println("Escolha uma opção:");
        System.out.println("\t - (1) DOLA");
        System.out.println("\t - (2) EURO");
        System.out.println("\t - (3) LIBRA");


        opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println(num * 6.);

                break;
            case 2:
                System.out.println(num * 5.64);
                break;
            case 3:
                System.out.println(num * 7.40);
                break;

            default:
                System.out.println("invaliduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");


        }
    }
}