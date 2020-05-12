package labs.lab1;
import java.util.Scanner;
public class second {

	public static void main(String[] args) {
//		calculate subtract from dad to me and birth year times 2
		int your_age;
		int your_dadage;
		int your_birthyear;
		int foot;
		double inch;
		double centimeters;
		
		
//		input age, dad age, and birthday then do the subtract of dad and my age, also two times birthyear
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your age:");
		your_age=input.nextInt();
		System.out.println("Please enter your dad's age:");
		your_dadage=input.nextInt();
		System.out.println("Please enter your birth_year:");
		your_birthyear=input.nextInt();
		System.out.println(your_dadage+"-"+your_age+"="+(your_dadage-your_age));
		System.out.println(your_birthyear+"*"+2+"="+(your_birthyear*2));  
		
		
//		height convert inches to centimeters and inch to feet,inches
		System.out.println("Please enter your height in inch:");
		inch =input.nextDouble();
		System.out.println(inch+"*2.54 ="+(inch*2.54)+"cm");
		System.out.println(inch+"/12"+"="+(int)(inch/12)+"feet");
		System.out.println(inch+"%12"+"="+(inch%12.0)+"inches");
		//input my age: 29  dad age: 88  expect: 59 actual: 59
//		  input birthdayyear:1992 expect: 3984 actual 3984
//		
//		input height in inch and convert to "cm": 88.8        expect: 225.552   actual:225.552
//		height in inch and convert to "feet and inch"   expect: 7  4.8   actual: 7  4.79999999
//		
		
//		input my age: 5  dad age: 10  expect: 5 actual: 5
//		  input birthdayyear: 2 expect: 4 actual 4
//		input height in inch and convert to "cm":  23      expect:  58.42    actual: 58.42
//		height in inch and convert to "feet and inch"      expect:  1   11    actual: 1  11
//		
//		
		
		
		
		
		
		
		
		


	}

}
