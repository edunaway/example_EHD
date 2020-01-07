/**
 * 
 */


package example_EHD;

public class TestProgram {

	public static void main(String[] args) {
/*
		System.out.println("Hello World!");
		
		int a=10;
		double g=36.54;
		String temp= " interesting factoid";
		
		System.out.printf("this is an integer %d, this is a double %.2f, this is a String%s%n", a, g, temp); 
*/
		
		dog d= new dog(); 
		dog fido= new dog("Fido", 13);
		
		System.out.println(d.toString());
		
		System.out.println(fido.toString()); 
		
		
		
	}

}
