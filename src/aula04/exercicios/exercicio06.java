package aula04.exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanto se tirou???: ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Voce tirou " + nota + ", então ta aprovado ");
        } else if (nota >= 5 || nota <=7) {
            System.out.println("Voce tirou " + nota + ", então ta de recuperação ");

        } else {
            System.out.println("Voce tirou " + nota + ", então ta reprovado ");
        }
        
    }
}
