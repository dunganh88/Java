package Java;


public class Echo {
	public static void main(String[] args) {
		int data[] = { 1,80,22,134,0,33,93,45,33,12};
		int sum = 0;
		float ave = 0;
		for(int num : data) {
			sum += num;
		}
		ave = sum/10.0f;
		System.out.println("Total sum : " + sum);
		System.out.println("Mean:" + ave);
	}
}

