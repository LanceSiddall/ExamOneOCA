package passingValuesAndConstructors;
/**
Having the same method names but different arguments that the JVM will send 
the correct signatures to the correct method
 */

public class SameMethodDifferntArgu {
	double avg = 0.0;

	public static void main(String[] args) {
		SameMethodDifferntArgu task = new SameMethodDifferntArgu();
		System.out.println("Int 34, Int 25 Argument");
	task.calculateAverage(34, 25);
	System.out.println(task.avg);
	System.out.println("\n");
	System.out.println("Double 34.1, Int 28 Argument");
	SameMethodDifferntArgu task2 = new SameMethodDifferntArgu();
	task2.calculateAverage(34.1, 28);
	System.out.println(task2.avg);
	}
double calculateAverage(int mark1, int mark2){
	
	avg = (mark1 + mark2)/2.0;
	System.out.println("double calculateAverage(int mark1, int mark2)");
	return avg;
}
double calculateAverage(double mark1, int mark2){
	
	avg = (mark1 + mark2)/2.0;
	System.out.println("double calculateAverage(double mark1, int mark2)");
	return avg;
}
}
