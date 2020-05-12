package exams.first;
import java.util.Scanner;
public class Repetition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int x = Integer.parseInt(input.nextLine());
		for (int i=0; i<x; i++) {
			for (int j=0; j<x; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		input.close();

	}

}
