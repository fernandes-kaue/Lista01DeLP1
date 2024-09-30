package Questao1;

public class ConverterIntEmBinario {

    public static String intParaBinario(int a) {

        if (a == 0) return "";

        String resultado = intParaBinario(a/2);

        return resultado + (a%2);
    }

}
