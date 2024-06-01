import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner input = new Scanner(System.in);

        System.out.print("Número da conta: ");
        numero = input.nextInt();
        input.nextLine();
        System.out.print("Nome da agência: ");
        agencia = input.nextLine();
        System.out.print("Nome do cliente: ");
        nomeCliente = input.nextLine();
        System.out.print("Saldo: ");
        saldo = input.nextDouble();

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);

        input.close();
    }
}

