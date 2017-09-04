
class Person {
	 String name;
	 int age;
}

public class JavaClass {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Ian";
		person.age = 30;
		System.out.println("Name: " + person.name);
		System.out.println("Age: " + person.age);
	}
}
