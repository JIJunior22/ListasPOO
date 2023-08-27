package Lista1;

import java.util.Scanner;

public class Multiplo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um número para saber se é multiplo de 7: ");
        int numero=sc.nextInt();

        if(numero%7==0){
            System.out.printf("%d é um multiplo de 7",numero);
        }
        else{
            System.out.printf("%d NÃO é um multiplo de 7",numero);

        }
    }
}
