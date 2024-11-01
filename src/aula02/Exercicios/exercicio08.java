package aula02.Exercicios;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        float largura;
        float altura;

        Scanner scanner = new Scanner(System.in);


        System.out.println("qual é a largura ");
        largura = scanner.nextInt();
        System.out.println("qual é a altura");
        altura = scanner.nextInt();

        System.out.println("a area do retangulo é: " + largura * altura);

    }
}
