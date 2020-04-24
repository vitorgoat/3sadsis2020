package segunda.aep;

public class AppHoverBoard {

	public static void main(String[] args0) {
		HoverBoard HoverBoard1 = new HoverBoard("D-EDGEX", 87542, 92);

		HoverBoard1.verificarSituacaoDoHover();

		HoverBoard HoverBoard2 = new HoverBoard("LBS9001", 22544, 29);
		
		HoverBoard2.bloquearHover();
		HoverBoard2.verificarSituacaoDoHover();


	}
	
}

