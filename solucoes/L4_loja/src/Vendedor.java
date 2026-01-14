public non-sealed class Vendedor extends Funcionario {
    private int vendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public int consultar_vendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void realizar_venda(){
        if(this.isLogin()){
            this.vendas += 1;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Faça login para esta ação.");
        }
    }
}
