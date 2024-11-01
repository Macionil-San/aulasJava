package aula06.exemplos;

public class exemplo02 {
    public static void main(String[] args) {
        int[][] matrizNumero = new int[2] [3];

        matrizNumero[0][0] = 1;
        matrizNumero[0][1] = 2;
        matrizNumero[0][2] = 3;
        matrizNumero[1][0] = 4;
        matrizNumero[1][1] = 5;
        matrizNumero[1][2] = 6;

        System.out.println("VAlor da matriz na posição [0][2] = " + matrizNumero[0][2]);

        String [][] matrizNomes= new String[2][2];

        matrizNomes[0] [0] = "RMS";
        matrizNomes[0] [1] = "MKC";
        matrizNomes[1] [0] = "SGO";
        matrizNomes[1] [1] = "KT";

        System.out.println("valor matriz na posição [0][0] = " + matrizNomes[0][0]);

    }
}
