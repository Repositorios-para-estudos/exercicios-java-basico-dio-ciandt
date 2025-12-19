import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Conta conta = null;
        System.out.println("Bem vindo ao Banco ImagineAí!\n Crie sua conta aqui!");

        System.out.println("Prefere fazer o depósito inicial junto com a criação da conta? (s/n)");
        String opt = scn.next().toLowerCase();
        switch (opt){
            case "s":
                System.out.println("Entre com o valor do depósito:");
                double dep = scn.nextDouble();
                conta = new Conta(dep);
                break;
            case "n" :
                conta = new Conta(0);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println("""
                Menu:
                1 - Depositar dinheiro;
                2 - Verificar cheque especial;
                3 - Valor do cheque especial;
                4 - Consultar saldo;
                5 - Saque;
                6 - Pagamento de boleto;
                """);
        int opt_menu = scn.nextInt();
        assert conta != null;
        switch(opt_menu){
            case 1:
                System.out.println("Valor a ser depositado:");
                double dep = scn.nextDouble();
                conta.depositar(dep);
            case 2:
                if (conta.verificar_cheque()){
                    System.out.println("O cheque especial está sendo utilizado.");
                } else {
                    System.out.println("O cheque especial não está sendo utilizado.");
                }
            case 3: System.out.printf("O valor do cheque especial é %.2f",
                    conta.getChequeEspecial());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opt_menu);
        }
    }
}