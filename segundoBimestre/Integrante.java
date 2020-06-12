package unicesumar.segundoBimestre;

public class Integrante {

	private String nomeIntegrante;

	private InstrumentoMusical instrumento;

	public Integrante(String nomeIntegrante) {
	
		this.nomeIntegrante = nomeIntegrante;

	}	
		
	public void setNomeIntegrante(String nomeIntegrante) {

		this.nomeIntegrante = nomeIntegrante;
	}

	public String getNomeIntegrante() {

		return nomeIntegrante;
	}

	public void setInstrumento(InstrumentoMusical instrumentoDoMembro) {

		this.instrumento = instrumentoDoMembro;
	}

	public InstrumentoMusical getInstrumento() {

		return instrumento;
	}
}
