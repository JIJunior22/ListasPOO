package Lista2;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.printf("%d é um número POSITIVO", n);
        } else if (n == 0) {
            System.out.printf("%d é ZERO", n);

        } else {
            System.out.printf("%d é um número NEGATIVO", n);
        }
    }
}
