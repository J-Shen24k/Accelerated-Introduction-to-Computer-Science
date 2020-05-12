package labs.lab7;
import java.util.Scanner;

public class BinarySearch {

	public static int search(String[] a, String string) {
		int start = 0;
		int end = a.length;
		int pos = -1;
		boolean found = false;
		while (!found && start < end) {
			int middle = (start + end) / 2;
			
			if (a[middle].compareTo (string)>0) {
				end = middle;
			} else if (a[middle].compareTo(string)<0) {
				start = middle;
			} else {
				found = true;
				pos = middle;
			}
		}
		
		return pos;
	}

	public static void main(String[] args) {
		String b = "";
		Scanner input = new Scanner(System.in);
		String[] a = {"c", "html", "java", "python", "ruby", "scala"};
		Insertion.sort(a);
		System.out.println("Please enter the programming languagae which you want to search: ");
		b = input.nextLine();
		System.out.println(search(a, b));
		input.close();
	

	}



}
