package Questao01;

public class MMC {

    public static int calcularMMC(int a, int b) {

        if (a == 0 || b == 0) return 0;

        int mdc = MMC.calcularMDC(a, b);
        return Math.abs(a * b) / mdc;
    }

    private static int calcularMDC(int a, int b) {

        if (b == 0) return a;

        return calcularMDC(b, a % b);
    }

}
