package aula07.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class desafio02 {
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"id", "nome", "telefone", "email"};
    static String[][] matrizCadastro = {{"", ""}};

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;

        String menu = """
                ________________________________________________
                |  ESCOLHA UMA OPÇÃO:                           |
                |       1 - EXIBIR CADASTRO COMPLETO            |
                |       2 - INSERIRIR NOVO USUÁRIO              |
                |       3 - ATUALIZAR CADASTRO POR ID           |
                |       4 - DELETAR CADASTRO POR ID             |
                |       5 - SAIR                                |
                |_______________________________________________|               
                
                """;

        int opcao;
        do {

            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    exibirUsuario();
                    break;


                case 2:
                    cadastrarUsuario();

                    break;

                case 3:
                    atualizarUsuario();
                    break;

                case 4:
                    deletarUsuario();
                    break;

                case 5:
                    System.out.println("_________FIM DO PROGRAMA__________");
                    break;

                default:
                    System.out.println("Opcão invalida!!!");
            }
        } while (opcao != 5);
    }

    public static void exibirUsuario() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linhas : matrizCadastro) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                int tamanhoColuna = colunas == 0 ? 5 : (colunas == 2? 10 : 25);
                tabela.append(String.format("%-"+ tamanhoColuna+"s|",  linhas[colunas]));

            }
            tabela.append("\n"); //PARA PULAR PRA PROXIMA LINHAA
        }
        System.out.println(tabela);


    }

    public static void cadastrarUsuario(){
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        String[][] novaMatriz = new String[matrizCadastro.length+qtdUsuarios][cabecalho.length];

        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length);
        }

        System.out.println("Preencha os dados a seguir:");
        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {

            System.out.println("Cadastro da pessoa " + linha);

            System.out.println(cabecalho[0] + ": " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //Converte valor inteiro para String

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.next();
            }
        }
        matrizCadastro = novaMatriz;
    }

    public static void atualizarUsuario() {
    }

    public static void deletarUsuario() {
    }


}
