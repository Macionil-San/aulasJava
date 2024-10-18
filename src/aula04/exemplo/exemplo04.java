package aula04.exemplo;

import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String corSemafaro;
        System.out.println("qual é a cor que ta?: ");
        corSemafaro = scanner.nextLine();

        switch (corSemafaro) {
            case "verde", "Verde":
                System.out.println("Siga");
                break;

            case "vermelho:", "Vermelho":
                System.out.println("Paraaaa");
                break;

            case "amarelo:", "Amarelo":
                System.out.println("Atenção ai negooo");
                break;
            default:
                System.out.println(corSemafaro + "? tem essa cor não nego ");
        }

        scanner.close();
    }
}

