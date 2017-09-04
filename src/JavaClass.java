class Thing {
	public String name;
	public static String description;
	public final static int LUCKY_NUMBER = 66;
	
	public void showName() {
		System.out.println(this.name + " " + description);
	}
	
	public static void showInfo() {
		System.out.println(description);
	}
}

class Machine {
	private String name;
	private int age;
	
	public Machine(String name) {
		this.name = name;
	}
	
	public Machine(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getName() {
		System.out.println("Name: " + this.name);
	}
	
	public void getNameAge() {
		System.out.println("Name: " + this.name + " Age: " + this.age);
	}
}

class Robot {
	public void speak(String text) {
		System.out.println(text );
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}
 
class Person {
	 private String name;
	 private int age;
	 void speak() {
		System.out.println(
			"My name is : " + this.name + " and my age is " + this.age); 
	 }
	 int calculateYearsToRetirement() {
		 int yearsLeft = 65 - this.age;
		 return yearsLeft;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 public void setName(String newName) {
		 this.name = newName;
	 }
	 
	 public void setAge(int newAge) {
		 this.age = newAge;
	 }
}

public class JavaClass {
	public static void main(String[] args) {
		Person person = new Person();
//		person.name = "Ian";
//		person.age = 30;
//		System.out.println("Name: " + person.name);
//		System.out.println("Age: " + person.age);
		person.speak(); 
		System.out.println(person.calculateYearsToRetirement());
		person.setName("kosen");
		person.setAge(50);
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		
		
		Robot sam = new Robot();
		sam.speak("Hi I am Sam.");
		sam.jump(89);
		sam.move("West", 12.4);
		
		Machine m_one = new Machine("Koko");
		m_one.getName();
		
		Machine m_two = new Machine("Matope", 90);
		m_two.getNameAge();
		
		
		Thing thing_1 = new Thing();
		Thing thing_2 = new Thing();
		thing_1.name = "Bob";
		thing_2.name = "Sue";
		Thing.description = "I am thing;";
		System.out.println(thing_1.name);
		System.out.println(thing_2.name);
		System.out.println(Thing.description);
		System.out.println(Thing.LUCKY_NUMBER);
		thing_1.showName();
		Thing.showInfo();
	}
}
