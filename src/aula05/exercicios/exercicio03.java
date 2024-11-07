package aula05.exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Qual número você quer o fatorial?: ");
        num = scanner.nextInt();



            int mult = num - 1;

            do {
                num = num * mult;
                mult--;
            } while (mult > 0);

            System.out.println("O fatorial é " + num);


            scanner.close();
        }
    }
