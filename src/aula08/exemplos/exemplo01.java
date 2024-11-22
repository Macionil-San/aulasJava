package aula08.exemplos;

import java.io.File;
import java.io.IOException;

public class exemplo01 {
    public static void main(String[] args) {

        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");


        if (arquivo.exists()) {
            System.out.println("o arquivo existe");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("arquivo criado com sucesso " + arquivo.getName());
                } else System.out.println("falha em criar");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
