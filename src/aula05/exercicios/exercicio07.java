package aula05.exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("qual a nota: ");
        nota = scanner.nextInt();

        if (nota <11 && nota > 0){

            System.out.println("VALIDO");
        }else {

            System.out.println("INVALIDO");
        }
    }
}
