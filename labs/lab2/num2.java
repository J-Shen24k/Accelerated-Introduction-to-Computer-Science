package labs.lab2;
import java.util.Scanner;
public class num2 {
	
//	use while to x!=1 to judge if user stops to input the number
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter all the courses' scores:");
		double x;
		double sum = 0;
		int i = 0;
		x = input.nextDouble();
		
		
		while(x!=-1) {
			if(x>=0) {
				sum = sum + x;	
				i++;
			}
			x = input.nextDouble();
		} 
		
		
		double average;
		average = sum/i;
		System.out.println(average);}
}
//      input: 5.56  85.86  747.6   expect: 279.673333333     actual:  279.67333333333335
//      input: 4.876 5.4  998.35    expect: 336.208667        actual:  336.208666666666666
//      input: 3.5   7.8   9.4  8.1    expect: 7.2            actual:  7.20000000000001 





