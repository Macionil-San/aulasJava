package aula04.exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual é o primeiro num: ");
        int num01 = scanner.nextInt();

        System.out.println("qual é o segundo num: ");
        int num02 = scanner.nextInt();

        int opcao;

        System.out.println("Escolha umas opção:");
        System.out.println("\t - (1) SOMA");
        System.out.println("\t - (2) SUBTRAÇÃO");
        System.out.println("\t - (3) MULTPLICAÇÃO");
        System.out.println("\t - (4) DIVISÃO");


        opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println(num01 + " + " + num02 + " = " + (num02 += num01));

                    break;
                case 2:
                    System.out.println(num01 + " - " + num02 + " = " + (num02 - num01));
                    break;
                case 3:
                    System.out.println(num01 + " x " + num02 + " = " + num02 * num01);
                    break;
                case 4:
                    System.out.println(num01 + " / " + num02 + " = " + (num02 / num01));
                    break;


                default:
                    System.out.println("invaliduuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");

            }

        }
    }
