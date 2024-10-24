package aula04.exemplo;

public class exercicio07 {

    public static void main(String[] args) {

        float valorCompra = 150.50f;
        float desconto = 0.2f;
        float valorFinal;

        valorFinal = valorCompra > 100.0f ? valorCompra - valorCompra * desconto : valorCompra;
        System.out.println(valorFinal);

    }
}
