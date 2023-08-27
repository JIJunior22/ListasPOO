package Lista2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1=sc.nextDouble();
        System.out.print("Ditige a 2ª nota: ");
        double nota2=sc.nextDouble();

        double media=(nota1+nota2)/2;

        if(media<7){
            System.out.printf("A média do aluno foi %.1f - Reprovado!",media);

        } else if (media<10) {
            System.out.printf("A média do aluno foi %.1f - Aprovado!",media);
            
        } else if (media==10) {
            System.out.printf("A média do aluno foi %.1f - Aprovado com Distinção",media);

        }else{
            System.out.println("Média invalida!");
        }



    }
}
