public class Conta {
    private final double cq_especial;
    private double saldo;
    private double limite;
    private boolean is_cq_usando;

    public Conta(double primeiro_deposito) {
        double cqEspecial;
        this.saldo = primeiro_deposito;

        if (primeiro_deposito <= 500){
            cqEspecial = 50;
        } else {
            cqEspecial = primeiro_deposito/0.5;
        }

        this.cq_especial = cqEspecial;
        this.limite = saldo + cq_especial;
    }

    // getters
    public double getSaldo(){
        return saldo;
    }

    public double getChequeEspecial(){
        return cq_especial;
    }

    public double getLimite() {
        return limite;
    }

    //métodos
    public void depositar(double deposito) {
        if(is_cq_usando){
            this.saldo += deposito/0.2;
        } else {
            this.saldo += deposito;
        }
        this.limite += saldo;
    }

    public boolean verificar_cheque(){
        return is_cq_usando;
    }

    /*
    * Tenho uma certa dúvida no enunciado da diferença de sacar e pagar boleto,
    * estarei considerando que sacar mexe somente no saldo, desconsiderando o limite,
    * enquanto pagar boleto depende do limite inteiro, junto com o cheque especial.
    */

    public void sacar(double saque){
        if(saque <= saldo){
            this.saldo -= saque;
            System.out.printf("Saque de %.2f realizado com sucesso! \nO saldo atual é de %.2f", saque, saldo);
        }
        System.out.println("Saldo não disponível para o saque.");
    }

    public void pagar_boleto(double valor){
        if(valor > saldo && valor <= limite){
          this.saldo = 0;
          this.is_cq_usando = true;
          System.out.println("Pagamento realizado com sucesso!");
        } else if(valor <= saldo && valor > 0){
            this.saldo -= valor;
            System.out.println("Pagamento realizado com sucesso!");
        } else{
            System.out.println("Limite não disponível para o pagamento!");
        }
    }
}
