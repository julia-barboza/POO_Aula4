package POO4;

public class Cadeira {

	String material;
	String cor;
	String possuiRodas;
	String possuiApoioBracos;
	String regulagemAltura;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPossuiRodas() {
		return possuiRodas;
	}
	public void setPossuiRodas(String possuiRodas) {
		this.possuiRodas = possuiRodas;
	}
	public String getPossuiApoioBracos() {
		return possuiApoioBracos;
	}
	public void setPossuiApoioBracos(String possuiApoioBracos) {
		this.possuiApoioBracos = possuiApoioBracos;
	}
	public String getRegulagemAltura() {
		return regulagemAltura;
	}
	public void setRegulagemAltura(String regulagemAltura) {
		this.regulagemAltura = regulagemAltura;
	}

	public void girar() {
        System.out.println("A cadeira está girando.");
    }

    public void ajustarAltura(int novaAltura) {
        System.out.println("Altura da cadeira ajustada para: " + novaAltura + " cm");
    }

    public void reclinar() {
        System.out.println("A cadeira está reclinando.");
    }

    public void mover(String direcao) {
        System.out.println("A cadeira se move para: " + direcao);
    }
}

