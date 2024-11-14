package aula07.exemplos;

public class exemplo03 {
    public static void main(String[] args) {
       int retorno = funcaoComParametroSemRetorno(2, 3);
        System.out.println(retorno);
    }

    private static int funcaoComParametroSemRetorno(int num01, int num02) {
        return num01 + num02;

    }
}
