package Lista2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> media = new ArrayList<Double>();


        int encerrar = 0;
        while (encerrar != -1) {
            System.out.print("Digite uma nota ou [-1] para sair: ");
            double nota = sc.nextDouble();
            if (nota == -1) {
                encerrar = -1;
            } else {

                media.add(nota);


            }


        }
        double soma = 0;
        for (Double notas : media) {
            soma += notas;

        }
        double somaMedia=0;
        for(double notas:media){
            somaMedia+=notas/media.size();

        }
        double inferior=0;
        for(double valor:media){
            if(valor<7){
                inferior=valor+valor;
            }
        }
        System.out.println("Encerrando...");
        System.out.println("--= INFORMAÇÕES GERAIS =--");
        System.out.println("QUANTIDADE DE VALORES LIDOS: " + media.size());
        System.out.println("SOMA DOS VALORES: " + soma);
        System.out.println("VALORES NA ORDEM EM QUE FORAM INFORMADOS: " + media);
        System.out.println("VALORES NA ORDEM INVERSA À QUE FORAM INFORMADOS: ");
        System.out.println("MÉDIA DOS VALORES: "+somaMedia);
        System.out.println("QUANTIDADE DE VALORES ACIMA DA MÉDIA CALCULADA: ");
        System.out.println("QUANTIDADE DE VALORES ABAIXO DE SETE: "+inferior);
        System.out.println();
        System.out.println("'A diferença entre o aluno e o cachorro,\n" +
                " é que do cachorro as pessoas tem pena...\n" +
                " - Autor desconhecido.'");


    }
}


