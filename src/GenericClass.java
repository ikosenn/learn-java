import java.util.ArrayList;

class Machinee {
	
	@Override 
	public String toString() {
		return "I am a machine";
	}
}

class Camera extends Machinee {
	@Override 
	public String toString() {
		return "I am a camera";
	}
}

public class GenericClass {

	public static void main(String[] args) {
		ArrayList<Camera> l = new ArrayList<>();
		l.add(new Camera());
		l.add(new Camera());
		printStr(l);
	}
	
	private static void printStr(ArrayList<? extends Machinee> l) {
		for (Machinee m: l) {
			System.out.println(m);
		}
	}

}
