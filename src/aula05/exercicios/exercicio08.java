package aula05.exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        int impar;
        int par = 0;

        for (int i = 1; i < 11; i++){
            System.out.println("numero " + i + ": ");
            num = scanner.nextInt();

            if (num % 2 == 0){

             par = num;
                System.out.println("esse num é par: " + par);
            }else {

                impar = num;
                System.out.println("esse mum é impar: " + impar);
            }

            System.out.println("existem " + par);

        }



    }
}
