package unicesumar.segundoBimestre;

public class AppDaBanda {

	public static void main(String[] args) {

	Integrante Phil = new Integrante ("Phil Collins");
	InstrumentoMusical guitarra = new InstrumentoMusical("Guitarra",Phil);
	
	System.out.println("O integrante: " + Phil.getNomeIntegrante() + "possui dominio sobre o (a)" + guitarra.getNomeInstrumento());
	
	
	Banda genesis = new Banda("Genesis", Phil);
	
	Integrante John = new Integrante ("John Robert");
	Integrante Matthew = new Integrante ("Matthew Shadow");
	Integrante Kenny = new Integrante ("Kenny Roggers");

	genesis.addIntegrante(John);
	genesis.addIntegrante(Matthew);
	genesis.addIntegrante(Kenny);

	for (int i=0; i<genesis.getIntegrante().size(); i++){
	
		System.out.println("A banda: "+ genesis.getNomeBanda() + "possui os seguintes membros:" + genesis.getIntegrante());
	}

	
	Ouvinte Vitor = new Ouvinte ("Vitor Souza", 19);
	Ouvinte Joares = new Ouvinte ("Joares Antonio", 23);
	Ouvinte Kelvin = new Ouvinte ("Kelvin Robert", 28);
	Ouvinte Luiz = new Ouvinte ("Luiz Alisson", 15);

	genesis.addOuvinte (Kelvin);
	genesis.addOuvinte (Vitor);
	genesis.addOuvinte (Luiz);
	genesis.addOuvinte (Joares);
	
	for (int i=0; i<genesis.getOuvinte().size(); i++){
	
		System.out.println("A banda: "+ genesis.getNomeBanda() + "tem os fãs:" + genesis.getOuvinte().get(i));
	}	
}
