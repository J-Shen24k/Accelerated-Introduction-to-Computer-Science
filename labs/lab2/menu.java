package labs.lab2;
import java.util.Scanner;
public class menu {
	
//	while loop is for repeating the menu and switch loop is for selecting your options

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum;
		boolean running = true;
		
		while (running) {
			System.out.println("*************");
		    System.out.println("Menu");
		    System.out.println("1. Say hello");
		    System.out.println("2. Addition");
		    System.out.println("3. Multiplication");
		    System.out.println("4. Exit");
		    System.out.println("*************");
		    int type = input.nextInt();
		    
			switch(type) {
	//	when you choose 1 get "Hello"
					case(1):
					System.out.println("Hello!");
			    break;
	//	when you choose 2 you need enter 2 numbers and get the sum of them  
				case(2):
					System.out.println("Please enter two numbers: ");
				    double a = input.nextDouble();
				    double b = input.nextDouble();
				    sum = a + b;
				    System.out.println(sum);
				    break;
			//	choose 3 you get product of two numbers
				case(3):
					System.out.println("Please enter two numbers: ");
				    double oa = input.nextDouble();
				    double ob = input.nextDouble();
				    double result;
				//    result = oa + ob;
				    result = oa * ob;
				    System.out.println(result);
				    break;
				    // exit progrm
				case(4):
					System.out.println("Exit");
					running = false;
				    break;
				    //default
				default:
					System.out.println("I donot know what you said.");
					break;	 }
			  
		}	
		}
	}
//    input: 1 expect: "Hello!"  actual: "Hello!" then return to menu
//    input: 2 expect: 2+3=5     actual: 5.0      then return to menu
//    input: 3 expect: 2*3=6     actual: 6.0      then return to menu
//    input: 4 expect: "Exit"    actual:"Exit"    then  end the program