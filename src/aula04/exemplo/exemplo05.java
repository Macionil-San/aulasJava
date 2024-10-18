package aula04.exemplo;

import java.util.Scanner;

public class exemplo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha umas opção:");
        System.out.println("\t - (1)");
        System.out.println("\t - (2)");
        System.out.println("\t - (3)");

        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("tu escolheu a 1");
                break;
            case 2:
                System.out.println("tu escolheu a 2");
                break;
            case 3:
                System.out.println("tu escolheu a 3");
                break;

            default:
                System.out.println("invaliduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        }

    }
}
