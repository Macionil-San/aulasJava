package aula06.exercicios;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                boolean[] vetorBoolean = new boolean[8];
                int contador = 0;

                for (int i = 0; i < vetorBoolean.length; i++) {
                    System.out.println("Digite true ou false: ");
                    vetorBoolean[i] = scanner.nextBoolean();
                }
                for (boolean valorBoolean : vetorBoolean) {
                    if (valorBoolean) {
                        contador++;
                    }
                }
                System.out.println("Foram inseridos "+contador+" true");

                scanner.close();

    }
}
