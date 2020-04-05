
package MyPackage;
import java.util.*;

public class Getit {






	public  static void main(String[] args) {
//Newone.jackdan();//
		
		String name = null;
int Age = 0;
String Add = null;
String mob = null;
String Gender = null;
NM(name, Age,Gender, Add, mob);


	}
	
	
	public static void NM(String name, int Age, String Gender,  String Add, String mob){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name Here: ");
		name = input.nextLine();
		
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your Age Here: ");
		Age = input1.nextInt();
		
		@SuppressWarnings("resource")
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter your Gender Here: ");
		Gender = input4.nextLine();
		
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your Address Here: ");
		Add = input2.nextLine();
		
		@SuppressWarnings("resource")
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter your Mobile Number Here: ");
		mob = input3.nextLine();
		
		
		//System.out.println(Gender);//
		String Male = "Male";
		Object Female = "Female";
		if (Gender.equals(Male) && Age>18 ){
			
		System.out.println("~~~~~~~~~DEAR SIR~~~~~~~~~~~");
		
		for(int s = 0; s<20;s++){
		
		System.out.println("***********Hello Welcome to the Party**********");
		System.out.println("Name: " +name);
		System.out.println("Age: " +Age);
		System.out.println("Address: " +Add);
		System.out.println("Mobile Number: " +mob);
		}
		}else if(Gender.equals(Female) && Age>18){
			System.out.println("~~~~~~~~~DEAR MAM~~~~~~~~~");
			System.out.println("***********Hello Welcome to the Party**********");
			System.out.println("Name: " +name);
			System.out.println("Age: " +Age);
			System.out.println("Address: " +Add);
			System.out.println("Mobile Number: " +mob);
			NewThree.division();
			
		}else{
			System.out.println("I am sorry you cannot attend this party :(");
			Newone.sad();
		}
		System.out.println("I am back");
	}



	

}
