package aula04.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quanto tu vendeu nego???: ");
        float valorDeVendas = scanner.nextFloat();

        float comissao;


        if (valorDeVendas <1000){
            comissao = 0.05F;
        } else if (valorDeVendas >= 1000 && valorDeVendas <= 5000) {
            comissao = 0.1F;
        }else{
            comissao = 0.15F;
        }

        float valorFinal;

        valorFinal = valorDeVendas + valorDeVendas * comissao;
        System.out.println(valorFinal);

    }
}