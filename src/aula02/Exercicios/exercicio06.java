package aula02.Exercicios;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num01;
        int num02;

        System.out.println("qual é o primero numero ");
        num01 = scanner.nextInt();
        System.out.println("qual é o segundo numero ");
        num02 = scanner.nextInt();

        if (num01 > num02){
            System.out.println(num01+" é maior que "+num02);
        }else {
            System.out.println(num02+" é maior que "+num01);
        }
    }

}
