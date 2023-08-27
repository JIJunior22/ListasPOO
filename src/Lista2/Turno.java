package Lista2;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno você estuda?");
        System.out.println("-".repeat(25));
        System.out.println("  M-matutino\n" +
                "  V-Vespertino\n" +
                "  N-Noturno");
        System.out.println("-".repeat(25));
        System.out.print("Em que turno você estuda? ");
        String turno = sc.next().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;

            default:
                System.out.println("Valor inválido!");
                break;
        }

    }
}
