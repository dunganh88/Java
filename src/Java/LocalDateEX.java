package Java;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class LocalDateEX {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		date = date.minusDays(today-1);
		DayOfWeek dow = date.getDayOfWeek();
		int value = dow.getValue(); // ngay dau tien cua tuan
		System.out.println("Mon Tue Wed Thus Fri Sat Sun");
		for(int i = 1 ; i < value ; i++) {
			System.out.printf("    ");
		}
		while(date.getMonthValue() == month) {
			System.out.printf("%3d",date.getDayOfMonth());
			if(date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue() == 1)
				System.out.println("");
		}
		System.out.println("\n");
	}
}
