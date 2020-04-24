package segunda.aep;

public class AppHoverBoard {

	public static void main(String[] args0) {
		HoverBoard hoverBoard1 = new HoverBoard("D-EDGEX", 87542, 92);

		hoverBoard1.verificarSituacaoDoHover();

		HoverBoard hoverBoard2 = new HoverBoard("LBS9001", 22544, 29);
		
		hoverBoard2.bloquearHover();
		hoverBoard2.verificarSituacaoDoHover();


	}
	
}

