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
		
		// downcasting and upcasting 
		Laptop lap2 = new Laptop();
		Mac mac2 = new Mac();
		
		// upcasting
		Laptop lap3 = mac2;
		lap3.start();
		
		// downcasting
		Laptop lap4 = new Mac();
		Mac mac4 = (Mac)lap4;
		mac4.killProc();
	}
}
