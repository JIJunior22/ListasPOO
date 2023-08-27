package Lista2;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numero[]=new int [2];

        System.out.print("Digite o 1º número: ");
        numero[0]=sc.nextInt();
        System.out.print("Digite o 2º número: ");
        numero[1]=sc.nextInt();

        int maior=0;
        if(numero[0]>numero[1]){
            maior+=numero[0];

        }
        else{
            maior+=numero[1];
        }
        System.out.printf("O maior número entre %d e %d é %d",numero[0],numero[1],maior);
    }
}
