package wrapperClasses;
/**
Java defines a wrapper class for each of its primitive data types. The wrapper classes are used to wrap primitives in an object,
 so they can be added to a collection object. They enable all types to be treated like object instances. 
 Wrapper classes help you write cleaner code, which is easy to read. 
 For this exam, you should be able to write code that uses these wrapper classes
 */
public class Wrapper1 {
	//The Wrapper classes allows java to convert any primaitive data type into an object
		public static void main(String[] args) {
			int i = 5;
			Integer iObj = new Integer(i);
			System.out.println(iObj);
			
			
			//Allows other variables to use the wrapper class content
			int j = iObj.intValue();
			System.out.println(j);
			
			comparingObjects();
			
		
		}
		public static void comparingObjects(){
			Integer i1 = new Integer(10); //Constructors always
			Integer i2 = new Integer(10); //create new instances.
			
			Integer i3 = Integer.valueOf(10);//valueOf returns a cached
			Integer i4 = Integer.valueOf(10);//copy for int value 10.
			
			Integer i5 = 10;//Autoboxing returns a cached
			Integer i6 = 10;//copy for applicable values
			
			System.out.println(i1 == i2);
			System.out.println(i3 == i4);
			System.out.println(i4 == i5);
			System.out.println(i5 == i6);
			
			
		}

	}