//Run Hide
/**
 * Encapsulation == information hiding
 */
public class Encapsulation {
	private double weight;

	public void setWeight(double val) {
		if (val > -0 && val <= 1000) {
			weight = val;
		} else {
			System.out.print("Wrong Weight ");

		}
	}
	public double getWeight(){
		return weight;
	}

}

class Home {
	public static void main(String[] args) {
		Encapsulation ph = new Encapsulation ();
		ph.setWeight(-12.23);
		System.out.println(ph.getWeight());
		ph.setWeight(2222.23);
		System.out.println(ph.getWeight());
		ph.setWeight(22.23);
		System.out.println(ph.getWeight());
		
	}

}
