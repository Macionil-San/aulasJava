package auala05.exemplos;

import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("escolha a opção");

            System.out.println("\t -opção 1");
            System.out.println("\t -opção 2");
            System.out.println("\t -opção 3");
            System.out.println("\t -SAIR");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("você escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("você escolheu a opção 4, TCHAUUU");
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }while (opcao!= 4);
        System.out.println("fim do sistema");

    }
}
