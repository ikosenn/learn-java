
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
		
		//arrays
		int[] arrInt = {8,4,5};
//		arrInt = new int[3];
//		arrInt[0] = 80;
//		arrInt[1] = 83;
//		arrInt[2] = 30;
		for(int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		String[] fruits = {"apple", "banana", "mango"};
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		// multi-d lists
		int[][] matrice = {
			{3, 5, 6},
			{6, 3, 4},
			{9, 5, 6, 7}
		};
		System.out.println("Row 2: col 3: = " + matrice[2][3]);
		
		// cast 
		int intVal = 5;
		System.out.println(intVal);
		long lonVal = 7999;
		intVal = (int)lonVal;
		System.out.println(intVal);
		
		byte byteVaue =  (byte)900;
		System.out.println(byteVaue);
	}

}
