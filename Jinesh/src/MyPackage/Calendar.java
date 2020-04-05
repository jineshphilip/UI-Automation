package MyPackage;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Calendar {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today -1);
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		System.out.println(value);
		System.out.println("Mon Tus Wed Thu Fri Sat Sun");
		for(int i= -2; i < value; i++)
			System.out.print("  ");
			while (date.getMonthValue() == month)
			{
				System.out.printf("%3d" , date.getDayOfMonth());
				if(date.getDayOfMonth() == today){
					System.out.print("*");}
					else
						System.out.print(" ");
					date = date.plusDays(1);
					if (date.getDayOfWeek().getValue()==1) System.out.println();
				}
				if(date.getDayOfWeek().getValue() !=1) System.out.println();
				
					
					
					
		}
	}

	
				
			
			

	


