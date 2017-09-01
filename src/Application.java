
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello world");
		// primitive type
		int myNumber = 99;  // 32
		short myShort = 9999; // 16
		long myLong = 4345; //  67
		
		double myDouble = 7.4745;
		float myFloat = 459.8f;
		
		char myChar = 'y';
		boolean myBoolean = false;
		byte myByte = 127;
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
		
		// non primitive types.
		
		String myString = "Hello";
		String blank = " ";
		String name = "Bob";
		String greeting = myString + blank + name;
		System.out.println(myString);
		System.out.println(greeting);
		System.out.println("Hello" + " " + "Bob");
		System.out.println("My int is: " + myNumber);
	}

}
