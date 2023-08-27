package Lista1;

public class Operacoes {
    public static void main(String[] args) {
        int numero1=10;
        int numero2=2;

        int soma=numero1+numero2;
        int mult=numero1*numero2;
        int div=numero1/numero2;
        int sub=numero1-numero2;

        System.out.println("--= OPERAÇÕES =--");
        System.out.printf("A soma entre %d e %d é: %d %n",numero1,numero2,soma);
        System.out.printf("A multiplicação entre %d e %d é: %d %n",numero1,numero2,mult);
        System.out.printf("A divisão entre %d e %d é: %d %n",numero1,numero2,div);
        System.out.printf("A subtração entre %d e %d é: %d %n",numero1,numero2,sub);
    }
}
