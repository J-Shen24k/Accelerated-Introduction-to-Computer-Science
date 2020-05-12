package labs.lab3;
import java.io.File;
import java.util.Scanner;
public class lab301 {
	
	public static void main(String[] args) {
		double[] grades = null;
//		read from the file， then go to try 
		try {
			File file = new File("src/labs/lab3/grades.csv");
			Scanner input = new Scanner(file);
			grades = new double[14];
//			read the nextline if there is nextline, get all the data
			while (input.hasNextLine()) {
				for(int i =0; i<grades.length;i++) {
				String line = input.nextLine();
				String strGrades = line.split(",")[1];
				String strDouble = strGrades.substring(0, strGrades.length() - 1);	
				double value = Double.parseDouble(strDouble);
				System.out.println(value);
				grades[i]=value;
				}
			}
			
			input.close();
			}
//		if not try then go catch: when there is error 
		catch (Exception e) {
			System.out.println("Error trying to read file.");
		}
		
		
	System.out.println("------------------");	
//	calculate the average, then print out the results
if (grades != null) {
			
			double total = grades[0];
			for (int i=1; i<grades.length; i++) {
				total = total + grades[i];

			}
			System.out.println(total);
			
			System.out.println("Mean: " + total/grades.length);
			
		}
		
	}

}

// expect : 70.1428571         actual: 70.14285714285714



