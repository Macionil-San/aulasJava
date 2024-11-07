package aula06.exemplos;

public class exemplo06 {
    public static void main(String[] args) {
        int[][] matrixNumeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}


        };

        for (int linhas = 0; linhas < matrixNumeros.length; linhas++) {
            for (int colunas = 0; colunas < matrixNumeros[linhas].length; colunas++) {
                System.out.println(matrixNumeros[linhas][colunas]);
            }


            String[][] matrizNomes = {{"rms", "mkc"}, {"sor", "sgo"}};

            for (int linha = 0; linha < matrizNomes.length; linha++) {
                for (int colunas = 0; colunas < matrizNomes[linha].length; colunas++) {
                    System.out.println(matrixNumeros[linha][colunas]);
                }
            }
        }
    }
    }