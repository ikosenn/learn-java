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
		
	}
}
