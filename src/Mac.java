
public class Mac extends Laptop {
	public void killProc() {
		System.out.println("Killing process.");
	}
	// override
	@Override
	public void start() {
		System.out.println("MAC started");
	}
	
	public void showInfo() {
		System.out.println(this.name);
	}
}
