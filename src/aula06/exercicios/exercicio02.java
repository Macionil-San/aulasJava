package aula06.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] caracters = new String[6];
        caracters[0] = "a";
        caracters[1] = "b";
        caracters[2] = "c";
        caracters[3] = "d";
        caracters[4] = "e";
        caracters[5] = "f";

        System.out.println("ensira qualquer tecla pra começar: ");
        String carac = scanner.nextLine();


        for (int i = 0; i < caracters.length; i++) {


            do {

                System.out.println("qual caracter deseja saber se tem aqui: ");
                carac = scanner.nextLine();

            }
            while (!carac.equals(caracters[i]));

            System.out.println(caracters[i] + ", essa letra tem");
        }
    }
}


