package labs.lab1;
import java.util.Scanner;
public class sixth {

	public static void main(String[] args) {
		// let user to input height in inch then transfer to "cm"
		double inch;
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the height of item:");
		inch = input.nextDouble();
		System.out.println((double)inch+"*"+2.54+"="+(inch*2.54)+"cm");
		
		// input: 33.5, excepted:85.09, actual: 85.09
		// input: 10, excepted:25.4, actual: 25.4
		// input: 20.8, excepted:52.832, actual: 52.832
		// input: 2.8, excepted:7.112, actual: 7.11199999999999
		// input: 105.8, excepted:268.732, actual: 268.731999999999
		

	}

}
