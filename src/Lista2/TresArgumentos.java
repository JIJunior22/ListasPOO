package Lista2;

public class TresArgumentos {
    public static void main(String[] args) {
        int res = soma(5, 3, 2);
        System.out.println(res);


    }

    public static int soma(int a, int b, int c) {
        int calc = a + b + c;
        System.out.printf("A soma de %d,%d e %d é: ", a, b, c);
        return calc;

    }
}
