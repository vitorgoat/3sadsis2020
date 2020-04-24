package segunda.aep;

public class HoverBoard {
	

	private String nomeHover;
	private boolean desbloqueado;
	private int codigo;
	private double preco;

	public HoverBoard(String nomeHover, int codigo, double preco) {
		
		this.nomeHover = nomeHover;
		this.codigo = codigo;
		this.desbloqueado = false;
		this.preco = preco;
	}

	public boolean getDesbloqueado() {
		
		return this.desbloqueado;
	}	
	
    private void avisar(){
    	
    	System.out.println("Seu hoverboard se chama:" +this.nomeHover);
    	System.out.println("o código do HoverBoard é:" + this.codigo);
    	System.out.println("Para desbloquear é:" + this.preco);
    	
    }
    
	public void verificarSituacaoDoHover() {
		
		if (!this.getDesbloqueado()) {
			throw new RuntimeException("Esse HoverBoard não esta disponivel!.");
			
		}
	}
 
	public boolean estadoHoverBoard() {
		try {
			
			this.verificarSituacaoDoHover();
			this.avisar();
			System.out.println("HoverBoard Desbloqueado");
			
		
			return true;
		} catch (Exception erro) {
			this.avisar();
			System.out.println(erro.getMessage());
			return false;
		}
	}

	public void desbloquearHover() {
		
		this.desbloqueado = true;
	}
	
	public void bloquearHover() {
		
		this.desbloqueado = false;
	}
}
