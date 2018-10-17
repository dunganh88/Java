package Java;

import java.util.Scanner;

/**
 * Cmt javadoc
 * @author dunga
 * @version 1.0
 *
 */
public class HelloJava {
	public static void main(String[] args) {
//		System.out.println("Hello Java");
//		String str1 = "12";
//		int i = Integer.valueOf(str1); // lay kieu du lieu so tu String
//		System.out.println(i);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap h = ");
		int h = scanner.nextInt();
		System.out.println(h);
		for(int i = 1 ; i < h + 1 ; i++) {
			int k = h - i;
			int p = k + (2*i);
			for(int j = 1 ; j < k + p ; j++) {
				if(j <= k)  System.out.print("  "); 
				else if(k < j && j < p )  System.out.print(" *"); 
			}
			System.out.print("\n");
		}
		scanner.close();
	}
}
