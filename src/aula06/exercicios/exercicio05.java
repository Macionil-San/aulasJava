package aula06.exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = {"Maria","João","Ana"};
        boolean verificacao = false;

        System.out.println("Qual nome desejas verificar se está no vetor?");
        String nomeScanner = scanner.next();

        for (String nome : nomes) {
            if (nome.equals(nomeScanner)) {
                verificacao = true;
                break;
            }
        }
        if (verificacao) {
            System.out.println("Esse nome está presente no vetor");
        } else {
            System.out.println("Esse nome não está presente no vetor");
        }

        scanner.close();
    }

}
