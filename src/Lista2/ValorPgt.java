package Lista2;

import java.util.Scanner;

public class ValorPgt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da prestação? R$: ");
        double prestacao1 = sc.nextDouble();
        System.out.print("Número de dias em atraso: ");
        int atraso1 = sc.nextInt();

        System.out.println(valorPagamento(atraso1, prestacao1));

    }

    public static int valorPagamento(int diaAtraso, double prestacao) {

//        if (prestacao != 0) {
//            while (prestacao != 0) {
//                Scanner sc = new Scanner(System.in);
//                System.out.print("Qual o valor da prestação? R$: ");
//                double prestacao1 = sc.nextDouble();
//                System.out.print("Número de dias em atraso: ");
//                int atraso1 = sc.nextInt();

                double calc = diaAtraso * prestacao;
                double multa = (prestacao * 0.03)*diaAtraso;
                double juros = (prestacao * 0.01)*diaAtraso;
                double res = calc + multa + juros;


                System.out.println("--= RELATÓRIO GERAL =--");
                System.out.printf("O valor da prestação é  R$:%.2f %n", prestacao);
                System.out.printf("Total de dias em atraso: %d %n", diaAtraso);
                System.out.print("Total da prestação com acréscimo de 3% (Multa) ");
                System.out.printf("R$:%.2f %n",multa);
                System.out.print("Total da prestação com acréscimo de 1% (juros) R$:");
                System.out.printf("%.2f %n",juros);
                System.out.println("Total a pagar R$: " + res);

        return diaAtraso;
    }

        }








