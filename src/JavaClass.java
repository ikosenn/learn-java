
class Person {
	 String name;
	 int age;
	 void speak() {
		System.out.println(
			"My name is : " + this.name + " and my age is " + this.age); 
	 }
}

public class JavaClass {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Ian";
		person.age = 30;
		System.out.println("Name: " + person.name);
		System.out.println("Age: " + person.age);
		person.speak();
	}
}
