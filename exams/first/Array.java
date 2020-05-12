package exams.first;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]a = new int[10];
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Please enter a number: ");
			a[i] = Integer.parseInt(input.nextLine());
		}
		int max = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
		input.close();
	}

}
