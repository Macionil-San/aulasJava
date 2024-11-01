package aula04.exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha umas opção: ");
        System.out.println("\t - (1) eletronicos ");
        System.out.println("\t - (2) alimentos ");
        System.out.println("\t - (3) vestuario ");

        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("tu escolheu eletronicos");
                break;
            case 2:
                System.out.println("tu escolheu alimentos");
                break;
            case 3:
                System.out.println("tu escolheu vestuario");
                break;

            default:
                System.out.println("invaliduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        }
    }
}
