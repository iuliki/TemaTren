
public abstract class VagonCalatori extends Vagon {

	public int capacitatePasageri;

	public void deschidere() {
		System.out.println("Usile sunt deschise");
	}

	public void inchidere() {
		System.out.println("Usile sunt inchide");
	}

	public int getCapacitatePasageri() {
		return capacitatePasageri;
	}

}
