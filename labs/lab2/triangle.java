package labs.lab2;
import java.util.Scanner;
public class triangle {

	
	
//	outside loop for rows
//	inside loop for how many * in this line
	
	
	
	
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int i = input.nextInt();
	    for (int a=1;a<=i;a++) {
	    	for(int b=1;b<=a;b++) {
	    		System.out.print(" *");
	    	}
	    	System.out.println("");
	    }

	}

}
