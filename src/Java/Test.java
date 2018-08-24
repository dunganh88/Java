package Java;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("Anh Dung");
		System.out.println("Ten : " + person.getName() + "\ntuoi : " + person.getAge() + "\nDia chi : " + person.getAddress());
	}
}
