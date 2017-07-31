package passingValuesAndConstructors;

/**
 * -Unlike overloaded methods, which is used by name of the method, overloaded
 * constructors are invoked by using the key word this
 * -"this" must be the first statement in a constructor
 * if anything before "this" = won't compile
 * -Can't call two or more constructors within a constructor
 * because the call must be the first statement in a constructor
 */
public class OverloadedConstructors {
	String name;
	int age;

	// no argument constructor
	OverloadedConstructors() {
		// Invokes constructor that accepts two method arguments
		this(null, 0);// OverloadedConstructors(null, 0) will not work
	}

	// Constructor that accepts two method arguments
	OverloadedConstructors(String newName, int newAge) {
		name = newName;
		age = newAge;
	}

	public static void main(String[] args) {
		OverloadedConstructors n = new OverloadedConstructors("Marcus", 99);
		System.out.println(n.name + " " + n.age);
	}

}
