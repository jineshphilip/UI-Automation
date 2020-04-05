package MyPackage;

public class java1 {

	public static void main(String[] args) {
		
		Vcl add = new Vcl();
		
		int s = add.addTwoInt(1, 2);
		System.out.println("The Sum of Two Indiger:"+s);
		
		String Greeting = "Welcome to Core Java";
		System.out.println(Greeting);
		for(int i=0; i<Greeting.length(); i++){
			System.out.println(i);
			System.out.println();
		}

	}

}
