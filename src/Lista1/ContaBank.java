package Lista1;

public class ContaBank {
    public static void main(String[] args) {
        double conta=500.50;
        double deposito=conta+300.25;
        double saque=deposito-150.75;

        System.out.println("--= EXTRATO DA CONTA =--");
        System.out.println("Saldo da conta: "+conta);
        System.out.println("Foi depositado o valor de R$:300.25");
        System.out.println("Novo Saldo R$: "+deposito);
        System.out.println("Saque realizado de R$: 150.75");
        System.out.println("Saldo Atual R$: "+saque);
    }
}
