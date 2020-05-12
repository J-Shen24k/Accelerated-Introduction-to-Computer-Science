package labs.lab1;
import java.util.Scanner;
public class fourth {

	public static void main(String[] args) {
		// help user to make a selection of using "Celisius" or "Fahrenheit", if chooses something else it will say error.
//		   use the formula to convert "Celsius" to "Fahrenheit" or "Fahrenheit" to "Celsius"
     double Celsius;
     double Fahrenheit;
     Scanner input = new Scanner(System.in);
     System.out.println("Please choose a mode:");
      String mode = input.nextLine();
     
      
//      choose the model
      if(mode.equals("c")) {
    	 System.out.println("Please enter the Celsius:");
    	 Celsius=input.nextDouble();
    	 System.out.println(Celsius+"*"+1.8+"+"+32+"="+(Celsius*1.8+32));}
     else if(mode.equals("f")) {
    	 System.out.println("Please enter the Fahrenheit:");
    	 Fahrenheit=input.nextDouble();
    	 System.out.println((Fahrenheit+"-"+32)+"/"+1.8+"="+((Fahrenheit-32)/1.8));}
     else {
    	 System.out.println("Error, please enter a different mode");
     }
     input.close();
     
}
}

// C to F
//input: -30.8        expect:  -23.08       actual: -23.080000000005
//input:  23.6        expect:  74.48       actual:  74.48
//input:   40.5      expect:    104.9     actual:  104.9
//F to C
//input:    40     expect:  4.4444444444444       actual: 4.444444444444445
//input:      -20.8   expect:    -29.333333333333333     actual: -29.333333333332
//input:       100.5  expect:     38.0555555555556    actual: 38.05555555555556
// input: r or a or 1 expect: Error, please enter a different mode    actual: Error, please enter a different mode