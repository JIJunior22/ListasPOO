package Lista2;

import java.util.Scanner;

public class FolhaPgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor por hora trabalhada: ");
        double valorHora = sc.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horasTrab = sc.nextInt();

        double salBruto = valorHora * horasTrab;


        if (salBruto <= 900) {
            double inss = salBruto * 0.10;
            double sindicato = salBruto * 0.03;
            double fgts = salBruto * 0.11;
            double totDesc = inss + sindicato;
            double liquido = salBruto - totDesc;

            System.out.println("=".repeat(35));
            System.out.println("--= FOLHA DE PAGAMENTO ON-LINE =--");
            System.out.println("=".repeat(35));
            System.out.println("  Salário Bruto R$:" + salBruto);
            System.out.println("  (-) IR: ISENTO");
            System.out.println("  (-) INSS (10%) R$:" + inss);
            System.out.println("  (-) Sindicato (3%) R$:" + sindicato);
            System.out.println("  FGTS (11%) R$:" + fgts);
            System.out.println("  Total de descontos R$:" + totDesc);
            System.out.println("  Salário Líquido R$:" + liquido);
            System.out.println("=".repeat(35));
        } else if (salBruto > 900 && salBruto <= 1500) {
            double ir = salBruto * 0.05;
            double inss = salBruto * 0.10;
            double sindicato = salBruto * 0.03;
            double fgts = salBruto * 0.11;
            double totDesc = inss + sindicato;
            double liquido = salBruto - totDesc;

            System.out.println("=".repeat(35));
            System.out.println("--= FOLHA DE PAGAMENTO ON-LINE =--");
            System.out.println("=".repeat(35));
            System.out.println("  Salário Bruto R$:" + salBruto);
            System.out.println("  (-) IR (5%) R$: " + ir);
            System.out.println("  (-) INSS (10%) R$:" + inss);
            System.out.println("  (-) Sindicato (3%) R$:" + sindicato);
            System.out.println("  FGTS (11%) R$:" + fgts);
            System.out.println("  Total de descontos R$:" + totDesc);
            System.out.println("  Salário Líquido R$:" + liquido);
            System.out.println("=".repeat(35));

        } else if (salBruto > 1500 && salBruto <= 2500) {
            double ir = salBruto * 0.10;
            double inss = salBruto * 0.10;
            double sindicato = salBruto * 0.03;
            double fgts = salBruto * 0.11;
            double totDesc = inss + ir + sindicato;
            double liquido = salBruto - totDesc;

            System.out.println("=".repeat(35));
            System.out.println("--= FOLHA DE PAGAMENTO ON-LINE =--");
            System.out.println("=".repeat(35));
            System.out.println("  Salário Bruto R$:" + salBruto);
            System.out.println("  (-) IR (10%) R$:" + ir);
            System.out.println("  (-) INSS (10%) R$:" + inss);
            System.out.println("  (-) Sindicato (3%) R$:" + sindicato);
            System.out.println("  FGTS (11%) R$:" + fgts);
            System.out.println("  Total de descontos R$:" + totDesc);
            System.out.println("  Salário Líquido R$:" + liquido);
            System.out.println("=".repeat(35));

        } else if (salBruto > 2500) {
            double ir = salBruto * 0.20;
            double inss = salBruto * 0.10;
            double sindicato = salBruto * 0.03;
            double fgts = salBruto * 0.11;
            double totDesc = inss + ir + sindicato;
            double liquido = salBruto - totDesc;

            System.out.println("=".repeat(35));
            System.out.println("--= FOLHA DE PAGAMENTO ON-LINE =--");
            System.out.println("=".repeat(35));
            System.out.println("  Salário Bruto R$:" + salBruto);
            System.out.println("  (-) IR (20%) R$: " + ir);
            System.out.println("  (-) INSS (10%) R$:" + inss);
            System.out.println("  (-) Sindicato (3%) R$:" + sindicato);
            System.out.println("  FGTS (11%) R$:" + fgts);
            System.out.println("  Total de descontos R$:" + totDesc);
            System.out.println("  Salário Líquido R$:" + liquido);
            System.out.println("=".repeat(35));

        }

    }
}
