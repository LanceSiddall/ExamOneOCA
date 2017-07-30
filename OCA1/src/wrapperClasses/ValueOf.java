package wrapperClasses;

public class ValueOf {

	public static void main(String[] args) {
		valueOfMethod();	

	}
	static void valueOfMethod(){
	Long var1 = Long.valueOf(123);
	Long var2 = Long.valueOf("123");
	System.out.println(var1 == var2);
	
	Long var3 = Long.valueOf(223);
	Long var4 = Long.valueOf(223);
	System.out.println(var3 == var4);
	}

}
