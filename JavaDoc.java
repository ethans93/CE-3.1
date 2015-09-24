/**
 * The purpose of this program is to show the different
 * features of "printf"
 * @author Ethan Steen
 * @version 1.0
 */
public class CE31 {
	public static void main(String [] args){
		
		String string;
				
		int decint;
		//decimal integer
		
		double expo;
		//exponential floating-point
		
		double flo;
		//floating-point number
		
		string = "Hello";
		decint = 3;
		expo = 566589;
		flo = 0.927456;
		
		System.out.print("%s -> ");
		System.out.printf("%s", string);
		System.out.println();
		System.out.print("%10s -> ");
		System.out.printf("%10s", string);
		/*
		 * %s adds a space, in size related to the number
		 * between '%' and 's', before the string variable
		 */
		
		System.out.println();
		System.out.println();
		
		System.out.print("Unicode #120 %c -> ");
		System.out.printf("%c", 120);
		System.out.println();
		System.out.print("Unicode #120 %7c -> ");
		System.out.printf("%7c", 120);
		/*
		 * %c adds a space, in size related to the number
		 * between '%' and 'c', before the character
		 * related to the Unicode number
		 */
		
		System.out.println();
		System.out.println();
		
		System.out.print("%d -> ");
		System.out.printf("%d", decint);
		System.out.println();
		System.out.print("%5d.525 -> ");
		System.out.printf("%5d.525", decint);
		/*
		 * %d can add the space before the numerical value
		 */
		
		System.out.println();
		System.out.println();
		
		System.out.println("Without %e -> " + expo);
		System.out.print("With %e -> ");
		System.out.printf("%e", expo);
		//%e takes a large number and puts it into exponential form 
	
		System.out.println();
		System.out.println();
		
		System.out.print("%f -> ");
		System.out.printf("%f", flo);
		System.out.println();
		System.out.print("%f -> ");
		System.out.printf("%.2f", flo);
		//%e rounds a decimal number to the desired point
		 
		
		
		
	}

}
