package labs.lab5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class CTAStationapp {
	private ArrayList<CTAStation> stations = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	

	public void readFile() { 
		try {
			sc = new Scanner(new File("src/labs/lab5/greenLineStops.csv")); 
			sc.nextLine();
			while (sc.hasNext()) {
				String[] data = sc.nextLine().split(",");
				CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Boolean.parseBoolean(data[5]));
				stations.add(instance);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file is not found");
		}
	}
	public void displayStationNames() {
		for (int i=0; i<stations.size();i++) {
			System.out.println(stations.get(i).getName());
		}
	}
		
	public void displayByWheelchair() {
		System.out.println("Please enter Y or N.");
		boolean finish = false;
		Scanner input = new Scanner(System.in);
		while(!finish) {
			String in = input.next();
			finish = true;
			if (in.equalsIgnoreCase("y")) {
				for (int i=0; i<stations.size(); i++) {
					if (stations.get(i).haswheelchair()==true) {
						System.out.println(stations.get(i).getName());
					}
					
				}
				break;
			}
			else if (in.equalsIgnoreCase("n")) {
				for (int i=0; i<stations.size(); i++) {
					if (stations.get(i).haswheelchair()==false) {
						System.out.println(stations.get(i).getName());
					}
				}
				break;
			}
			else {
				System.out.println("Invalid Input. Try again with 'Y' for Yes and 'N' for No.");
				finish = false;
				
				
			}
		}
		input.close(); 
	}
		
	public void displayNearest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a latitude: ");
		double lat = Double.parseDouble(input.nextLine());
		System.out.println("Please enter a longitude: ");
		double lng = Double.parseDouble(input.nextLine());
		double smallest = stations.get(0).calcDistance(lat,lng);
		int number = 0;
		for (int i=0; i<stations.size(); i++) {
			if (stations.get(i).calcDistance(lat, lng)<smallest) {
				smallest = stations.get(i).calcDistance(lat, lng);
				number = i;
			}
		}
		System.out.println("The nearest station is "+stations.get(number).getName()+"and"+" , the distance is "+smallest);
		input.close();
	}
		
		
	public void start() {
		int x = 0;
		boolean done = false;
		Scanner input = new Scanner(System.in);
		while(!done) {	
			readFile();
			System.out.println("Menu");
			System.out.println("1. Display Station names.");
			System.out.println("2. Display with/without Wheelchair.");
			System.out.println("3. Display Nearest Station.");
			System.out.println("4. Exit.");
			String in = input.nextLine();
			done = true;
			if (in.equalsIgnoreCase("Station names.")|| in.equalsIgnoreCase("1")) {
				x = 1;
			}
			else if (in.equalsIgnoreCase("Wheelchair.")|| in.equalsIgnoreCase("2")) {
				x = 2;
				
			}
			else if (in.equalsIgnoreCase("Nearest Station.")|| in.equalsIgnoreCase("3")) {
				x = 3;
				
			}
			else if (in.equalsIgnoreCase("Exit.")|| in.equalsIgnoreCase("4")) {
				System.out.println("Exit.");
				break;
			}
			else {
				done = false;
				
			}
		}
			
		switch (x) {
				
			case 1:
				displayStationNames();
				break;
			case 2:
				displayByWheelchair();
				break;
			case 3:
				displayNearest();
				break;
			default:
				System.out.println("Bye.");
				break;
		}
		
		input.close();
	}
	
	public static void main(String[] args) {
		CTAStationapp cta = new CTAStationapp();
		cta.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}