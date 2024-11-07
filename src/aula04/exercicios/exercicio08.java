package aula04.exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual é o segundo num: ");
        int num02 = scanner.nextInt();

        int opcao;

        System.out.println("Digite sua avaliação: ");
        System.out.println("\t - (1) ");
        System.out.println("\t - (2) ");
        System.out.println("\t - (3) ");
        System.out.println("\t - (4) ");
        System.out.println("\t - (5) ");


        opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("média");
                break;
            case 4:
                System.out.println("acima da média");
                break;
            case 5:
                System.out.println("exelente");
                break;


            default:
                System.out.println("invaliduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");

        }

    }
}


