package Exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int num01= 2, num02 = 4;
        float resultado;

        resultado = num01+num02;
        System.out.println("a resultado dos numeros é: " +resultado );
        resultado = num01-num02;
        System.out.println("a subtração dos numeros é: " +resultado );
        resultado = num01*num02;
        System.out.println("a multiplicação dos numeros é: " +resultado );


         // resultado = (float) num01/num02;                                          PRIMEIRO JEITO DE FAZER
        // System.out.println("a divisão dos numeros é: " +resultado );

        float totalFloat, numFloat=2;
        totalFloat = numFloat / num02;                                                //SEGUNDO METODO
        System.out.println("a divisão dos números é: " + totalFloat);

        float modulo = numFloat % num02;
        System.out.println("o resto da divisão dos números : " + numFloat +" e " + num02 +" é igual a "+ modulo);

    }
}
