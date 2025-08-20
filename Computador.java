package POO4;

public class Computador {
 
	String processador;
	String memoriaRAM;
	String armazenamento;
	String sistemaOperacional;
	String placaDeVideo;
	String mouse; 
	String teclado;
	
	public String getTeclado() {
		return teclado;
	}
	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	public String getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	public String getPlacaDeVideo() {
		return placaDeVideo;
	}
	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}
	public void ligar() {
        System.out.println("O computador está ligado.");
    }

    public void desligar() {
        System.out.println("O computador está desligado.");
    }

    public void instalarPrograma(String programa) {
        System.out.println("Instalando o programa: " + programa);
    }

    public void reiniciar() {
        System.out.println("O computador está reiniciando.");
    }


}

