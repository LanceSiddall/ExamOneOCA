package CallingAndUsingObjects;
//Run Test
/**
 * Getters and setter allow the class to be well encapsulated
 */
public class Object {
	double marcusAge;

	public static void main(String[] args) {
		Object e = new Object();
		e.setAge(30.5);
		System.out.println(e.getAge());

	}

	// Setter mutator method
	public void setAge(double newAge) {
		marcusAge = newAge;

	}

	// Getter Accessor
	public double getAge() {
		return marcusAge;
	}

}

class Employee{
	private String name;
	public void setName(String val){
		name = val;
	}
	public int daysOffWork(int... days){
		int daysOff = 0;
		for (int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
}
class Test {
	public static void main(String[] args){
		Employee e = new Employee();
		System.out.println(e.daysOffWork(1, 2, 3, 4));
		System.out.println(e.daysOffWork(1, 2, 3));
		
	}
}


