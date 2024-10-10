package Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        String texto = " esse texto esta na primeira linha \n esse texto esta na segunda linha \n esse texto esta na terceira linha \n\t esse texto esta na quarta linha (COM TABULAÇÃO)";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade:  ");

        int idade= scanner.nextInt();
        scanner.nextLine();  //ESSE COMANDO SERVE PRA CONSUMIR O \n QUE O nextInt DEIXOU NA MEMÓRIA
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Seu nome é " +nome+ "e sua idade é " +idade);
    }
}
