package aula04.exemplo;

import java.util.Scanner;

public class exemplo03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int idade;

        System.out.println("Quantos anos tiene?: ");
        idade = scanner.nextInt();

        if(idade<= 12 && idade >0){
            System.out.println("Tu é criança");

        } else if (idade >= 13 && idade <= 17) {

            System.out.println("Tu é aborrecente");

        }else if (idade >= 18 && idade <= 64) {

            System.out.println("Tu é adultim");

        } else{
            System.out.println("se é idoso");
        }
        scanner.close();
    }
}



