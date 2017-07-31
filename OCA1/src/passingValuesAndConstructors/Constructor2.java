package passingValuesAndConstructors;

/**
 * Depending on the placement in the class, they will execute before the class's
 * constructor
 */
public class Constructor2 {
	{
		System.out.println("Initializer 1");
	}

	Constructor2() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Initializer 2");
	}

	public static void main(String[] args) {
		Constructor2 e = new Constructor2();

	}

}
