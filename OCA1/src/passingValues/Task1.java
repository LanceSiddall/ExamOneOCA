package passingValues;

public class Task1 {
	double avg = 0.0;

	public static void main(String[] args) {
		Task1 task = new Task1();
		System.out.println("Task1");
	task.calculateAverage(34, 25);
	System.out.println(task.avg);
	System.out.println("Task2");
	Task1 task2 = new Task1();
	task2.calculateAverage(34.1, 28);
	System.out.println(task2.avg);
	}
double calculateAverage(int mark1, int mark2){
	
	avg = (mark1 + mark2)/2.0;
	System.out.println("Method1");
	return avg;
}
double calculateAverage(double mark1, int mark2){
	
	avg = (mark1 + mark2)/2.0;
	System.out.println("Method2");
	return avg;
}
}
