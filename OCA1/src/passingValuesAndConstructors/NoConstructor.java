package passingValuesAndConstructors;
/**
-No constructor is defined
-default constructor is created, that does not accept method arguments
-if NoConstructor(int String name, Int age) is created
even though the above constructor takes arguments, the JVM will not create
a default constructor, because this is still a constructor
 */
public class NoConstructor {
String name;
int age;
}




class Office{
	public static void main(String args[]){
		NoConstructor no = new NoConstructor();
		no.name = "Marcus";
		System.out.println(no.name);
	}
}
