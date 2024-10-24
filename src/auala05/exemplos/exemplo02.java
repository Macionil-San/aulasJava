package auala05.exemplos;

import java.util.Scanner;

public class exemplo02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        do{
            System.out.println("digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        } while (idade < 18);
        System.out.println("você é maior de idade");

        scanner.close();
    }

}


