package labs.lab4;
//import java.util.Scanner;

public class GeoLocation_application {

	public static void main(String[] args) {
//		GeoLocation gl = new GeoLocation();
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter the lat and lng: ");
//		double lat = input.nextDouble();
//		double lng = input.nextDouble();
//		GeoLocation gl1 = new GeoLocation(lat, lng);
//		System.out.print(gl.toString());
//		System.out.print(gl1.toString());
//		if(!gl1.latbetween()||!gl1.lngbetween()) {
//				System.out.println("one of your values doesnt make sense");
//		}	
//		input.close();
		
		
		
//		one default and one non_default
		GeoLocation gl = new GeoLocation();
		GeoLocation gl1 = new GeoLocation(30, 30);
		System.out.println("("+(gl.getLat()+","+gl.getLng()+")"));
		System.out.println("("+(gl1.getLat()+","+gl1.getLng()+")"));
	}
	
	
}
