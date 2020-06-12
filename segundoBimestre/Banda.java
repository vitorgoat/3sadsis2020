package unicesumar.segundoBimestre;

import java.util.ArrayList;

public class Banda {

	private String nomeBanda;
	
	private ArrayList<Integrante> integranteArrayList = new ArrayList<Integrante>();
	
	private ArrayList<Ouvinte> ouvinteArrayList = new ArrayList <Ouvinte> ();

	public Banda(String nomeBanda, ArrayList<Integrante> integranteArrayList) {
	
		this.nomeBanda = nomeBanda;
		
		if(this.integranteArrayList == null){
		
			throw new RuntimeException("Na banda deve haver pelo menos um integrante, ou melhor, o vocalista!");
		}
                this.integranteArrayList  = integranteArrayList;
	}
	
	public String getNomeBanda() {
	
		return nomeBanda;
	}


	public void addIntegrante(Integrante i) {
	
		this.integranteArrayList.add(i);
	}
	
	public ArrayList<Integrante> getIntegrante(){
	
		return integranteArrayList;
	}

		
        public void addOuvinte(Ouvinte o) {
		
		if(this.ouvinteArrayList.contains(o) ) {
			
			return;
		}
		this.ouvinteArrayList.add(o);
		o.addBanda(this);
	}
	
	public ArrayList<Ouvinte> getOuvinte(){
	
		return ouvinteArrayList;
	}

}
