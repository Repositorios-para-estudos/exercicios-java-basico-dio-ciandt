public non-sealed class Atendente extends Funcionario{
    private float caixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void receber_pagamento(float valor) {
        if(this.isLogin()){
            this.caixa += valor;
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Faça login para esta ação.");
        }
    }

    public void fechar_caixa(){
        System.out.printf("O caixa fechou com %.2f", this.caixa);
    }
}
