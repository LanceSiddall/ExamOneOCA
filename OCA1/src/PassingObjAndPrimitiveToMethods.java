
public class PassingObjAndPrimitiveToMethods {
	//Run Office

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Employee{
	int age;
	void modifyVal(int a){
		a = a + 1;
		System.out.println(a);
	}
}
class Office {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.age);
		e.modifyVal(e.age);
		System.out.println(e.age);
	}
}

