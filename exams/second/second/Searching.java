package exams.second.second;

import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
	
		String a[] = {"biology", "cubism", "grim", "iris", "jackal", "lance", "mourning", "newt", "potassium", "yeti"};
		Scanner input = new Scanner(System.in);
		
		System.out.println("Print the stuff you want to search:");
		String item = input.nextLine();
		int low = 0;
		int high = a.length;
		int search = searching(a, low, high, item);
		
		if(search==-1){
			System.out.println("The word isnot in list please try again.");
		}
		else {
			System.out.println("The word is in the list .\nIndex of " + item + ": " + search);
		}
		
		input.close();
		}
	

	public static int searching(String a[], int low, int high, String item){
		if(low>high){
			return -1;
		}
		int middle = low + ((high-low)/2);
		if(item.equalsIgnoreCase(a[middle])){
			return middle;
		}
		else if(a[middle].compareToIgnoreCase(item)>0){
			return searching(a, low, middle-1,item);
		}
		else{
			return searching(a, middle+1, high, item);
		}
	}


}

