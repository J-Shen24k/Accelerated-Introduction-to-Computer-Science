package labs.lab1;
import java.util.Scanner;
public class fifth {

	public static void main(String[] args) {
		// get the amount of length, width, and depth. Then use the formula to calculate square
		double length;
		double width;
		double depth;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length:");
		length = input.nextDouble();
		System.out.println("Please enter the width:");
		width = input.nextDouble();
		System.out.println("Please enter the depth:");
		depth = input.nextDouble();
		
		
		
		System.out.println("*************");
		System.out.println("The amount of wood (square feet) needed to make the box:");
		System.out.println(length+"*"+width+"*"+2+"+"+length+"*"+depth+"*"+2+"+"+width+"*"+depth+"*"+2+"="+(length*width*2+length*depth*2+width*depth*2));
		System.out.println("*************");

	}

}
// input: L:2.8 W: 2.8 D: 2.8   expect: 47.04   actual:47.039999999
//input: L:10.5 W: 2.2 D: 3.5   expect: 135.1   actual:135.1
//input:L:55.8 W: 23.2 D: 4   expect: 3221.12   actual: 3221.12
