package labs.lab3;
import java.io.FileWriter;
import java.util.Scanner;
public class lab302 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	boolean done = false;
	
			double a = 0;
			String n = null;
//	  make the output in a new file 	
		try {
			FileWriter output = new FileWriter("src/labs/lab3/output.txt");
			
//		when user doesnot input done, then start to input numbers	
			do{
				System.out.print("Enter a number: ");
			    n = input.nextLine();
			    
//		start to output in the result file
			    if (!n.equalsIgnoreCase("done")) {
			    	try {
						a = Double.parseDouble(n); 
						output.write(a+"\n");
						output.flush();
			    	} 
//			    	when the format of input is wrong 
			    	catch (NumberFormatException nfe) {
						System.out.println(n + " is not a number. ");
					}
			    } 
			    
			    
			    else {
			    	done = true;
			    }
			}while(!done);
			
			
			output.close();
		} 
		
		
//		when there is an error
		catch (Exception e) {
			System.out.println("Error");
		}
		
		
		input.close();
    }
}

