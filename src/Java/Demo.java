package Java;

public class Demo {
	private String name;
	private int age;
	
	/*
	 * Để tạo các hàm getter & setter tự động thì 
	 * ta dùng tổ hợp phím Alt + Shift + S và chọn mục Generate Getters and Setters... 
	 * hoặc có thể vào mục Source ở thanh trên cùng và chọn mục như trên
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
