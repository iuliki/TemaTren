
public class CalatoriB extends VagonCalatori {
	public CalatoriB() {
		super();
		this.capacitatePasageri = 50;
		this.capacitateColecte = 400;
	}

	public void blocareGeam() {
		System.out.println("Geamurile sunt blocate");
	}

	public String tipVagon() {
		return "vagon de tip CalatoriB";
	}

}
