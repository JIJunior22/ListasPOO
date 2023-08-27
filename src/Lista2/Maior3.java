package Lista2;

import java.util.Scanner;

public class Maior3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;

        System.out.print("Digite o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            maior = n1;

        } else if (n2>n1 && n2>n3) {
            maior=n2;

        } else if (n3>n1&&n3>n2) {
            maior=n3;

        }
        System.out.println("O maior número é: "+maior);
        //Pesquisei métodos para realizar essa questão. Eu poderia fazer como no Maior número, só que quis variar.
        System.out.println("O menor número é: "+Math.min(n1,Math.min(n2,n3)));
    }
}
