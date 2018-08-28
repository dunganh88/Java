package Java;


public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("Dung Anh");
		System.out.println("Ten : " + p1.getName() + "\ntuoi : " 
		+ p1.getAge() + "\nDia chi : " + p1.getAddress());
		p1.setId(2000);
		System.out.println("id = " + p1.getId());
		Person p2 = new Person("Alan");
		p2.setAge(20);
		p2.setAddress("Las Vegas , American");
		Person.increase();
		System.out.println("Ten : " + p2.getName() + "\ntuoi : " 
		+ p2.getAge() + "\nDia chi : " + p2.getAddress());
		System.out.println("id = " + p2.getId());
		Person p3 = new Person("Anh Quan");
		Person.increase();
		System.out.println("Ten : " + p3.getName() + "\ntuoi : " 
		+ p3.getAge() + "\nDia chi : " + p3.getAddress());
		System.out.println("id = " + p3.getId());
	}
}
