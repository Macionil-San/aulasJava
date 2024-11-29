package aula06.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas pessoas você deseja cadastrar: ");
        int qtPessoas = scanner.nextInt();
        scanner.nextLine();   // ISSO TA SERVINDO PRA CONSUMIR O \N

        String[] cabecalho = {"id", "nome", "telefone", "email"};
        String[][] matrizCadastro = new String[qtPessoas + 1][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        for (int linhas = 1; linhas <= qtPessoas; linhas++) {
            System.out.print("Preencha as informações a seguir: ");
            System.out.println("ID - " + linhas);
            matrizCadastro[linhas][0] = String.valueOf(linhas);
            System.out.print("NOME: ");
            matrizCadastro[linhas][1] = scanner.nextLine();
            System.out.print("TELEFONE: ");
            matrizCadastro[linhas][2] = scanner.nextLine();
            System.out.print("EMAIL: ");
            matrizCadastro[linhas][3] = scanner.nextLine();

        }

        String tabela = "";
        for (String[] linhas : matrizCadastro) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                tabela += linhas[colunas] + "\t\t";

            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }
}
