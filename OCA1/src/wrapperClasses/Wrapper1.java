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
			//did it work
			//It did work
		}

	}