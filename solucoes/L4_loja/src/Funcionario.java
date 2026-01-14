import java.nio.file.attribute.UserPrincipalNotFoundException;

public sealed abstract class Funcionario permits Vendedor, Gerente, Atendente {
    private String nome;
    private String email;
    private String senha;
    private final boolean isAdmin;
    private boolean isLogin;

    //    construtor padrão
    public Funcionario(String nome, String email, String senha, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
        this.isLogin = false;
    }

    //    getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isLogin(){
        return isLogin;
    }

    //    metódos padrão do funcionário
    public void login(String usuario, String senha) {
        if (usuario.equals(this.email) && senha.equals(this.senha)) {
            System.out.printf("Login realizado com sucesso!\n " +
                    "Seja Bem vindo, %s: %s", this.nome, this.getClass().toString());
            this.isLogin = true;
        } else {
            System.out.println("Credenciais inválidas. Tente novamente mais tarde");
        }
    }

    public void logout() {
        if(this.isLogin){
            System.out.println("Deslogando...");
            this.isLogin = false;
        } else {
            System.out.println("Você não está logado.");
        }
    }

    public Funcionario editar_dados(String nome, String email){
        if(this.isLogin){
            this.nome = nome;
            this.email = email;
            System.out.println("Usuário editado com sucesso!");
        } else {
            System.out.println("Faça login para acessar!");
        }
        return this;
    }

    public Funcionario alterar_senha(String senha){
        if(this.isLogin){
            this.senha = senha;
            System.out.println("Senha editada com sucesso!");
        } else {
            System.out.println("Faça login para acessar!");
        }
        return this;
    }

}
