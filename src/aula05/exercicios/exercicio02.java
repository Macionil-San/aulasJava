package aula05.exercicios;

public class exercicio02 {
    public static void main(String[] args) {

        int total = 0;
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {                                    // passa pelo filtro ai
                total += num;
                System.out.println("var total: " + num);
            }
            num = num + 1;                                        // adiciona 1 ao numero e faz a contagem exp: 1 = 1+1

        }
        System.out.println("final: " + total);
    }
}