package aula04.exercicios;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha umas opção:");
        System.out.println("\t - (1) 5h - 12h");
        System.out.println("\t - (2) 12h - 18h");
        System.out.println("\t - (3) 18h - 22h");
        System.out.println("\t - (4) 22h - 5h");


        opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("manhã");
                break;
            case 2:
                System.out.println("tarde");
                break;
            case 3:
            System.out.println("noite");
                break;
            case 4:
                System.out.println("madrugada");
                break;


            default:
                System.out.println("invaliduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");

        }

    }
}
