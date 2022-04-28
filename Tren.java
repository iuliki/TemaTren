
public class Tren {

	private Vagon[] vagoane = new Vagon[15];

	public Tren(Vagon[] vagoane) {

		this.vagoane = vagoane;
	}

	public boolean equals(Tren tren) {

		int capTotala1 = 0;
		int capTotala2 = 0;

		for (int i = 0; i < this.vagoane.length; i++) {
			capTotala1 = capTotala1 + this.vagoane[i].getCapacitateColecte();
		}

		for (int i = 0; i < this.vagoane.length; i++) {
			capTotala2 = capTotala2 + this.vagoane[i].getCapacitateColecte();
		}

		if (capTotala2 == capTotala1)
			return true;
		else
			return false;

	}

	public void afisare() {
		for (int i = 0; i < this.vagoane.length; i++) {
			System.out.println(this.vagoane[i].tipVagon() + "\n");
		}
	}
}
