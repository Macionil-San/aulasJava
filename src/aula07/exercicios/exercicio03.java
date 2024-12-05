package aula07.exercicios
        ;
import java.util.Scanner;

public class exercicio03 {

    public class Exercicio03_Dobrar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            int numero1 = scanner.nextInt();

            int dobro = dobrar(numero1);
            System.out.println("O dobro desse número é " + dobro);
        }

        static int dobrar(int num1) {
            return 2 * num1;
        }
    }
}
