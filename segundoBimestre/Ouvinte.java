package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Ouvinte {

	private String nomeOuvinte;
	private int idade;

	private ArrayList<Banda> bandaArrayList = new ArrayList<Banda>();

	public Ouvinte(String nomeOuvinte, int idade) {
	
		this.nomeOuvinte = nomeOuvinte;
		this.idade = idade;
	}

	public String getNomeOuvinte() {

		return this.nomeOuvinte;
	}

	public int getIdade() {

		return this.idade;
	}

	public void addBanda(Banda b) {

		if (!this.bandaArrayList.contains(b)) {

			this.bandaArrayList.add(b);
			b.addOuvinte(this);
		
		}
		return;
	}

	public ArrayList<Banda> getNomeBanda() {

		return bandaArrayList;
	}
}
