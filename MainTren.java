
public class MainTren {

	public static void main(String[] args) {

		CalatoriA cal1 = new CalatoriA();
		CalatoriB cal2 = new CalatoriB();
		CalatoriA cal3 = new CalatoriA();

		Marfa m1 = new Marfa();

		cal1.deschidere();
		cal2.blocareGeam();

		System.out.println(cal1.equals(cal2));
		System.out.println(cal1.equals(cal1));

	}

}
