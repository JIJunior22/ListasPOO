package Lista1;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.printf("%d é um número PAR", numero);
        } else {
            System.out.printf("%d é um número IMPAR", numero);
        }


    }
}
