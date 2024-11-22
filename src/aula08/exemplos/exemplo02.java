package aula08.exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exemplo02 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");


        try {
            FileWriter fileWriter = new FileWriter(arquivo, true);
            fileWriter.write("Texto gravado no arquivo");
            fileWriter.close();

            FileReader fileReader = new FileReader(arquivo);
            int caracter;
            while ((caracter= fileReader.read()) != -1){
                System.out.print((char) caracter);
            }

            fileReader.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
