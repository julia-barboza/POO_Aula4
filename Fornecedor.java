package POO4;

public class Fornecedor {

	String id;
    String razaoSocial;
    String nomeFantasia;
    String cnpj;
    String endereco;
    String fone;
    String email;
    String inscricaoEstadual;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public void fornecerProduto(String produto) {
        System.out.println("O fornecedor " + nomeFantasia + " está fornecendo: " + produto);
    }

    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado para: " + novoEndereco);
    }

    public void enviarEmail(String mensagem) {
        System.out.println("Enviando email para " + email + ": " + mensagem);
    }

    public void mostrarContato() {
        System.out.println("Contato do fornecedor " + nomeFantasia + ": " + fone + " | " + email);
    }
}
