package POO4;

public class Usuario {

	int ID;
	String nome;
	int senha;
	String permissao;
	String usuario;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void login() {
        System.out.println(nome + " está logando no sistema.");
    }

    public void logout() {
        System.out.println(nome + " se deslogou do sistema.");
    }

    public void alterarSenha(int novaSenha) {
        this.senha = novaSenha;
        System.out.println(nome + " alterou a senha com sucesso.");
    }

    public void mostrarPermissao() {
        System.out.println("Permissão do usuário " + nome + ": " + permissao);
    }
}

