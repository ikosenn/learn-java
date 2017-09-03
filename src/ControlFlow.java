import java.util.Scanner;

public class ControlFlow {

	private static Scanner input;
	private static Scanner scanner;

	public static void main(String[] args) {
		int value = 0;
		
		while (value < 10) {
			System.out.println(value);
			value = value + 1;
		}
		
		for (int i=0; i<90; i++) {
			System.out.println(i);
		}
		
		input = new Scanner(System.in);
		System.out.println("Enter a number");
		int checker = input.nextInt();
		if (checker > 10) {
			System.out.println("checker greater than ten");
		} else if (checker > 0 && checker <= 10)  {
			System.out.println("checker is less than or equal to 10 but greater that zero");
		} else {
			System.out.println("checker is less than zero");
		}
		
		// do while statements
		int number;
		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter a number:");
			number = scanner.nextInt();
			
		} while (number != 5);
		
		System.out.println("Done. Five was entered..");
		
		
		// switch statements
	}

}
