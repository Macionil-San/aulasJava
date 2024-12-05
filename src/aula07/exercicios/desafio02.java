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

        int opcão = 0;
        do {

            System.out.println(menu);
            int opcao = scanner.nextInt();
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
        } while (opcão == 5);
    }

    public static void exibirUsuario() {
        String tabela = "";
        for (String[] linhas : matrizCadastro) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                tabela += linhas[colunas] + "\t\t";

            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }

    private static void cadastrarUsuario() {

        System.out.println("quantas pessoas você deseja cadastrar: ");
        int qtPessoas = scanner.nextInt();
        scanner.nextLine();   // ISSO TA SERVINDO PRA CONSUMIR O \n
        String[][] matrizCadastro = new String[qtPessoas + 1][cabecalho.length];   // talvez is esteja no lugar errado

        String[][] novamatrizCadastro = new String[matrizCadastro.length + qtPessoas][cabecalho.length];

            for (int linha = 0; linha < matrizCadastro[0].length; linha++) {
                novamatrizCadastro[linha] = Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length );
            }

        System.out.print("Preencha as informações a seguir: ");
        for (int linhas = matrizCadastro.length; linhas < novamatrizCadastro.length; linhas++) {
            System.out.println(cabecalho[0]+"-"+linhas);
                novamatrizCadastro[linhas][0] = String.valueOf(linhas);

            for (int coluna = 1; coluna < cabecalho.length; coluna++){

                System.out.println(cabecalho[coluna]+": ");
                novamatrizCadastro[linhas][coluna] = scanner.nextLine();
            }
        }
        matrizCadastro = novamatrizCadastro;

    }

    public static void atualizarUsuario() {
    }

    public static void deletarUsuario() {
    }


}
