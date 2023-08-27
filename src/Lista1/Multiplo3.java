package Lista1;

import java.util.Scanner;

public class Multiplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para saber se é multiplo de 3: ");
        int numero = sc.nextInt();
        if (numero %3==0){
            System.out.printf("%d é multiplo de 3",numero);
        }
        else{
            System.out.printf("%d não é multiplo de 3",numero);
        }

    }
}
