package aula20200413.atividade;

import java.util.Random;

public class Pendrive {
	
	private String marca;
	private double capacidade;
	private String cor;
	private boolean conectado;
	
	
	
	public Pendrive() {
		this.capacidade = 16000;
		
		this.conectado=false;
	}


	public Pendrive(String marca, String cor) {
		
		this.marca = marca;
		this.cor = cor;
	}

	
// método de acesso 
	
	public String getCor() {
		return cor;
	}


// método de modificacao
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	public void conectar() {
		conectado=true;
	}
	
	public void desconectar() {
		conectado=false;
	}
	

	public void adicionarArquivo() {
		
		if (capacidade > 200) {
		this.capacidade-=200;
		
		}
		else {
			throw new RuntimeException("Pen drive cheio");
		}
	}
	
	
	
	public boolean formatarPendrive( ) {
		if (conectado==true) {
			return processoFormataçao();
		}
		else {
			throw new RuntimeException("O pen drive nao está conectado");
		}
		
	}
	
	public boolean processoFormataçao() {
		Random random = new Random();
		int processoFormatacao=random.nextInt(100);
		if(processoFormatacao >1) {
			capacidade=16000;
			return true;
		} else {
		return false;
		}

	}
		
}
