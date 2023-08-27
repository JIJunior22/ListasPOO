package Lista1;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Valor por hora trabalhada R$: ");
        double valorHora=sc.nextDouble();
        System.out.print("Número de horas trabalhadas: ");
        double horasTrab=sc.nextDouble();
        double salBruto=(valorHora*horasTrab)*30;


        double ir=salBruto*0.11;
        double inss=salBruto*0.08;
        double sind=salBruto*0.05;
        double salLiq=salBruto-ir-inss-sind;


        System.out.println("--= CONTRACHEQUE ON-LINE =--");
        System.out.printf("+ Salário Bruto R$: %.2f %n",salBruto);
        System.out.printf("- IRRF: %.2f %n",ir);
        System.out.printf("- INSS: %.2f %n",inss);
        System.out.printf("- Sindicato: %.2f %n",sind);
        System.out.printf("= Salário Líquido R$: %.2f %n",salLiq);


    }
}
