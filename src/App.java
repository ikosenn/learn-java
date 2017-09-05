import ocean.Fish;
import ocean.SeaWeed;
import ocean.plants.Algae;

public class App {
	public static void main(String[] args) {
		Fish fish = new Fish();
		SeaWeed sea = new SeaWeed();
		Algae alg = new Algae();
		
		// polymorphism
		Mac mac1 = new Mac();
		Laptop lappy = mac1;
		lappy.start();
		
	}
}
