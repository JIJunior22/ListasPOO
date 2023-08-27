package Lista2;

import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--= Escolha um dia da semana =--");
        System.out.println("1. Domingo\n" +
                "2. Segunda\n" +
                "3. Terça\n" +
                "4. Quarta\n" +
                "5. Quinta\n" +
                "6. Sexta\n" +
                "7. Sábado");
        System.out.print(">>>");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
