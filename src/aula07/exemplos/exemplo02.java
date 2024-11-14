package aula07.exemplos;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        funcaoComParametroSemRetorno(5, "teste");

    }

    static void funcaoComParametroSemRetorno(int parametro01, String parametro02) {
        System.out.println("parametro01 = " + parametro01);
        System.out.println("parametro02 = " + parametro02);
    }
}
