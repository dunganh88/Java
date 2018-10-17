package Java;

public class Person { // class danh cho mot nguoi
	private static int id;
	private String name; // ten 	
	private String address; // dia chi
	private int age; // tuoi
	
	/*
	 * khi viết hàm khởi tạo có tham số thì nên viết thêm hàm khởi tạo không có tham số 
	 * vì nếu không thì khi tạo một đối tượng mà ko có tham số sẽ bị lỗi
	 * VD : dòng 36 nếu bỏ hàm khởi tạo không tham số sẽ báo lỗi
	 * Person p2 = new Person();
	 */
	
	public Person() {
		name = "";
		address = "";
		age = 1;
	}
	public Person(String name , String address , int age) {
		this.name = name ;
		this.address = address;
		this.age = age;
	}
	
	/*
	 * để gọi đến phương thức khởi tạo khác trong một phương thức khởi tạo
	 * thì ta dùng cú pháp this(thứ tự tham số trong phương thức khởi tạo cần gọi)
	 * VD: gọi đến phương thức
	 * 	public Person(String address , int age )
	 * như ở dưới ta gọi bằng cách " this("Anh Dung", 21);
	 * 
	 * Lưu ý : hàm goi phương thức khởi tạo khác luôn nằm ở đầu tiên
	 * nếu không sẽ báo lỗi !!!
	 */
	
	public Person(String name) {
		this("Thai Hoa , Nghe An", 21);
		this.name = name ;
	}
	
	public Person(String address , int age) {
		this.address = address;
		this.age = age ;
	}
	
	void Display() {
		System.out.println("\nTen : " + name + "\nDia chi : " + address + "\nTuoi : " + age);;
	}
	
	public static void increase() {
		id++;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Doreamon","Japan",123); // tao ra mot doi tuong cua class Person
		p1.setId(2000);
		System.out.println("id = " + p1.getId());
		p1.Display();
		p1.setName("Nobita");
		p1.setAge(10);
		p1.Display();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		Person.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

