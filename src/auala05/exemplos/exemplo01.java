package auala05.exemplos;

import java.util.Scanner;
public class exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        while (idade < 15){

            idade = scanner.nextInt();
            System.out.println(idade);

        }

        System.out.println("você é maior de idade");
        scanner.close();
    }
}

