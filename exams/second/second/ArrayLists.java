package exams.second.second;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	private static ArrayList<Integer> a = new ArrayList<Integer>(); 
	public static void main(String[] args) {

		int x = 0;
		do {
			System.out.println("Please enter an integer which in positive or 0: ");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			if ( x>=0 ) {
				a.add(x);
			}
		}while(x>=0);
		
		System.out.println(a);
		
		int value=0;
		int b=0;
		value = a.get(0);
		int temp = 0;
		for (int i=0; i<a.size(); i++) {
			value = a.get(i);
			int count = 0;
			
			for (int i1=0; i1<a.size(); i1++) {
				if (a.get(i1)==value) {
					count++;
				}
			}

			if (count>temp) {
				temp = count;
				b=i;
			}

		}
		System.out.println(a.get(b));
		
		
	}
	
	
	
}
