package Lista2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Tabuada de: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int res=i*n;
            System.out.printf("%d x %d = %d %n",i,n,res);
        }
    }
}
