package exams.first;
import java.util.Scanner;
public class Selection {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int x = Integer.parseInt(input.nextLine());
		
		if (x%2 ==0 ) {
			System.out.println("foo");
		}
		
		else {
			System.out.println("bar");
		}
		input.close();

	}

}
