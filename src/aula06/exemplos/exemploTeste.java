package aula06.exemplos;

public class exemploTeste {


    //_____________________________________________________________________________________________________________
    //                                               ANOTAÇÕES:                                                   |
    // O [5] É O NÚMERO DE ELEMENTOS DO VETOR                                                                     |
    // VARIAVEIS PRIMITIVAS: É QUANDO VOCÊ ACESSA DIRETO O RESULTADO                                              |
    // OBJETO: É QUANDO ELE MOSTRA ONDE ESTA O VALOR(ENDEREÇO DELE)                                               |
    // PRIMERO [] QUANTIDADE DE LINHAS                                                                            |
    // A SEGUNDA [] É A QUANTIDADE DE COLUNAS                                                                     |
    // PRA ACHAR A POSIÇÃO NESSE CASO TEM QUE FAZER AS INTERSEÇÕES EXEMPLO: 2(SEGUNDA LINHA) 3(TERCEIRA COLUNA)   |
    // TEM COMO COLOCAR LAÇOS DE REPETIÇÃO NO VALOR QUE TA LA DENTRO ( x[i] )                                     |                                                                     |
    // length : VE O TAMANHO (2,4,5,7) TAMANHO = 4                                                                |
    // LEMBRAR QUE COMEÇA POR 0                                                                                   |
    //_____________________________________________________________________________________________________________


    public static void main(String[] args) {
        int[] nums  = {10,20,30,40};

        for (int num : nums) {
            System.out.println("elemento: " + num); ;
        }
    }
}

