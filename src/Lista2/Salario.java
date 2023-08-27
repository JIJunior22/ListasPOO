package Lista2;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Informe o valor do seu salario R$:");
        double salario=sc.nextDouble();

        if(salario<=280){
            double aumento=salario*0.20;
            int percentual=20;
            double novoSal=salario+aumento;

            System.out.println("=".repeat(25));
            System.out.println("  CONTRACHEQUE ON-LINE");
            System.out.println("=".repeat(25));
            System.out.println("SALARIO ATUAL R$: "+salario);
            System.out.println("PERCENTUAL DE AUMENTO APLICADO: "+percentual+"%");
            System.out.println("PERCENTUAL DE AUMENTO APLICADO R$:"+aumento);
            System.out.println("NOVO SALÁRIO R$: "+novoSal);

        } else if (salario>280 && salario<700) {
            double aumento=salario*0.15;
            int percentual=15;
            double novoSal=salario+aumento;

            System.out.println("=".repeat(25));
            System.out.println("  CONTRACHEQUE ON-LINE");
            System.out.println("=".repeat(25));
            System.out.println("SALARIO ATUAL R$: "+salario);
            System.out.println("PERCENTUAL DE AUMENTO APLICADO: "+percentual+"%");
            System.out.println("PERCENTUAL DE AUMENTO APLICADO R$:"+aumento);
            System.out.println("NOVO SALÁRIO R$: "+novoSal);

        } else if (salario>700&&salario<1500) {
            double aumento=salario*0.10;
            int percentual=10;
            double novoSal=salario+aumento;

            System.out.println("=".repeat(25));
            System.out.println("  CONTRACHEQUE ON-LINE");
            System.out.println("=".repeat(25));
            System.out.println("SALARIO ATUAL R$: "+salario);
            System.out.println("PERCENTUAL DE AUMENTO APLICADO: "+percentual+"%");
            System.out.println("PERCENTUAL DE AUMENTO APLICADO R$:"+aumento);
            System.out.println("NOVO SALÁRIO R$: "+novoSal);
            
        } else if (salario>=1500) {
            double aumento=salario*0.05;
            int percentual=5;
            double novoSal=salario+aumento;

            System.out.println("=".repeat(25));
            System.out.println("  CONTRACHEQUE ON-LINE");
            System.out.println("=".repeat(25));
            System.out.println("SALARIO ATUAL R$: "+salario);
            System.out.println("PERCENTUAL DE AUMENTO APLICADO: "+percentual+"%");
            System.out.println("PERCENTUAL DE AUMENTO APLICADO R$:"+aumento);
            System.out.println("NOVO SALÁRIO R$: "+novoSal);


        }




    }
}
