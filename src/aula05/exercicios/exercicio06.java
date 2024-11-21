package aula05.exercicios;

public class exercicio06 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int cont = 0;

        System.out.println("os primeiros 10 num: ");

        while (cont < 10) {
            System.out.print(n1 + " | ");

            int next = n1 + n2;
            n1 = n2;
            n2 = next;

            cont++;
        }
    }
}