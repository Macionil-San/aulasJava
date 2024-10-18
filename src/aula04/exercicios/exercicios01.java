package aula04.exercicios;

import java.util.Scanner;

public class exercicios01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Quantos anos tiene?: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("pode entra nego");

        } else {
            System.out.println("não ta liberadu");
        }
        scanner.close();
    }
}

