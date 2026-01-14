public non-sealed class Gerente extends Funcionario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void consultar_vendas(){
        if(this.isLogin()){
            System.out.println("O gerente está consultando as vendas.");
        } else {
            System.out.println("Faça login para esta ação.");
        }
    }

    public void relatorio_financeiro(){
        if(this.isLogin()){
            System.out.println("O gerente está gerando um relatório financeiro.");
        } else {
            System.out.println("Faça login para esta ação.");
        }

    }
}
