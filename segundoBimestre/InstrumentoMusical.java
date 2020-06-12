package unicesumar.segundoBimestre;

public class InstrumentoMusical {

	private String nomeInstrumento;

	private Integrante integrante;

	public InstrumentoMusical(String nomeInstrumento, Integrante integrante) {

		this.nomeInstrumento = nomeInstrumento;

		if (this.integrante == null) {

			throw new RuntimeException("O instrumento musical deve ja estar definido para um membro da banda !");
		}
	}

	public String getNomeInstrumento() {

		return nomeInstrumento;
	}

}
