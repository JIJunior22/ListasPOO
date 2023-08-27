package Lista2;

import java.util.Scanner;

public class TabuadaDiferenciada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("-".repeat(25));
        System.out.println("  Tabuada Diferenciada");
        System.out.println("-".repeat(25));
        System.out.print("Tabuada de: ");
        int n= sc.nextInt();
        System.out.print("Começa por: ");
        int n1=sc.nextInt();
        System.out.print("Até... ");
        int n2=sc.nextInt();

        for(int i=n1;i<=n2;i++){
            int res=n*i;

            System.out.printf("%d x %d = %d %n",n,i,res);
        }

        sc.close();

    }

}
