package passingValuesAndConstructors;
/**
Basic constructor with String message showing what a constructor does
 */
public class Constructor1 {
Constructor1(){
	System.out.println("Constructor:intialize");
}
	public static void main(String[] args) {
		Constructor1 task1 = new Constructor1();
		Constructor1 task2 = new Constructor1();
		task1.blankClass();
		task2.blankClass();
	}
	public void blankClass(){
		
	}

}
