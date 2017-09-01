
public class ControlFlow {

	public static void main(String[] args) {
		int value = 0;
		
		while (value < 10) {
			System.out.println(value);
			value = value + 1;
		}
		
		for (int i=0; i<90; i++) {
			System.out.println(i);
		}
		
		int checker = -11;
		if (checker > 10) {
			System.out.println("checker greater than ten");
		} else if (checker > 0 && checker <= 10)  {
			System.out.println("checker is less than or equal to 10 but greater that zero");
		} else {
			System.out.println("checker is less than zero");
		}
	}

}
