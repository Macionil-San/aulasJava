package aula08.exemplos;

import java.io.*;

public class exemplo03 {
    public static void main(String[] args) {

        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo, true));
            bufferedWriter.write(" |novo texto a ser gravado| ");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = bufferedReader.readLine()) != null){

                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
