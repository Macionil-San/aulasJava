package aula05.exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int mult = num -1;

        System.out.println("Qual numero se quer o fatorial?: "  );
        num = scanner.nextInt();


        do {

            mult--;
            num = num * mult;
            num--;


        }while (num <= 1);

        System.out.println(num);


    }
}
