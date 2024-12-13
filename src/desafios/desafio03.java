package desafios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class desafio03 {
    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"id", "nome", "telefone", "email"};
    static String[][] matrizCadastro = {{"", ""}};

    static File arquivoBancoDeDados = new File(System.getProperty("user.home"), "bancoDeDados.txt"); //faz tentar le na pasta de usario
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
                int tamanhoColuna = colunas == 0 ? 5 : (colunas == 2 ? 10 : 25);
                tabela.append(String.format("%-" + tamanhoColuna + "s|", linhas[colunas]));

            }
            tabela.append("\n"); //PARA PULAR PRA PROXIMA LINHAA
        }
        System.out.println(tabela);


    }

    public static void cadastrarUsuario() {

        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length + qtdUsuarios][cabecalho.length];
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
        }

        System.out.println("Preencha os dados a seguir:");

        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + ": " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //Converte valor inteiro para String

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.next();
            }
        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    public static void atualizarUsuario() {

        exibirUsuario();

        System.out.println("\n Digite o id do usuario para atualizar");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println(cabecalho[0] + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna] + ": ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuario();
        salvarDadosNoArquivo();
    }

    public static void deletarUsuario() {

        exibirUsuario();
        System.out.println("Digite o ID para deletar: ");
        int idEscolhido = scanner.nextInt();

        String[][] novaMatriz = new String[matrizCadastro.length - 1][cabecalho.length];
        novaMatriz[0] = cabecalho;
        for (int linha = 1, idNovaMatriz = 1; linha < matrizCadastro.length; linha++) {
            if (linha == idEscolhido) {
                continue;  // faz pular a linha do idEscolhido e não copiar ela

            }
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length); //  passando linha a linha na matriz
            novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuario deltado com sucesso!");
        exibirUsuario();
        salvarDadosNoArquivo();
    }


    public static void salvarDadosNoArquivo(){
        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("arquivoBancoDeDados"));){
            for (String[] linha: matrizCadastro){
               bufferedWriter.write( String.join(",",linha)+ "\n");

            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void carregarDadosDoArquivo(){
        String linha;
        StringBuilder conteuDoArquivo = new StringBuilder();

        if (!arquivoBancoDeDados.exists()){
            try {
                if (arquivoBancoDeDados.createNewFile()) {
                    System.out.println("Arquivo criado " + arquivoBancoDeDados.getName() + "com sucesso");

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("arquivoBancoDeDados"))) {

            while ((linha = bufferedReader.readLine())!= null ){
            conteuDoArquivo.append(linha).append("\n");           // append coloca na memoria // o otro append faz adiciona o /n

        }

         String[] linhaDadosUsuario = conteuDoArquivo.toString().split("/n");
            matrizCadastro = new String[linhaDadosUsuario.length][cabecalho.length];

            for (int i = 0; i <linhaDadosUsuario.length ; i++) {
                matrizCadastro[i] = linhaDadosUsuario[i].split(",");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
