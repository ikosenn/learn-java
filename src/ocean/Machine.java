package ocean;

public class Machine  implements Info {
	private String name;
	
	public void start() {
		System.out.println("Started");
	}
	
	public void showInfo() {
		System.out.println("Heya...");
	}
}
