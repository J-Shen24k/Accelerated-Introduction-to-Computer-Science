package labs.lab6;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class CTAapp {
	private CTARoute greenline = new CTARoute();
	private CTARoute redline = new CTARoute();
	private ArrayList <CTAStation> stops;
	private Scanner sc = new Scanner(System.in);
	
	
	
	
	public void readFile() { 
		try {
			sc = new Scanner(new File("src/labs/lab6/CTAStops.csv")); 
			sc.nextLine();
			while (sc.hasNext()) {
				String[] data = sc.nextLine().split(",");
				CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Integer.parseInt(data[5]), Integer.parseInt(data[6]));
				if (instance.getGreen() != -1) {
					greenline.addStation(instance);
				}
				
				if (instance.getRed() !=-1) {
					redline.addStation(instance);
				}
				
				}
		} catch (FileNotFoundException e) {
			System.out.println("The file is not found");
		}
	}
	
	public void addStation() {
		try {
			System.out.println("Please enter the variables in order with name, latitude, longitude, location, wheelchair, red and green. \n "
					+ "Please using comma to seperate the variabes. \n Hint: System has 32 red stations and 27 green stations now. "
					+ "When you enter a new station, please remember the station number need to bigger than the numbers we have right now. "
					+ "\n If you just choose only one of green and red, please input the other one is -1");
			Scanner in = new Scanner(System.in);
			String[] data = in.nextLine().split(",");
			CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Integer.parseInt(data[5]), Integer.parseInt(data[6]));
			if((Integer.parseInt(data[5])>32 && Integer.parseInt(data[6])==-1) || (Integer.parseInt(data[6])>27 && Integer.parseInt(data[5])==-1) ||(Integer.parseInt(data[5])>32 && Integer.parseInt(data[6])>27)) {
				stops.add(instance);
				System.out.println(stops);
			}
			else {
				System.out.println("Please follow the instruction.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Input doesnot match the requirement");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}

	public void removeStation() {
		System.out.println("Please enter the name of station which you want to delete:");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		for (int i=0; i<stops.size(); i++) {
			if (a.equalsIgnoreCase(stops.get(i).getName())) {
				stops.remove(stops.get(i));
			}
		}
		input.close();
	}

	public void insertStation() {
		try {	
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter the variables in order with name, latitude, longitude, location, wheelchair, red and green. \n "
					+ "Please using comma to seperate the variabes. \n Hint: System has 32 red stations and 27 green stations now. "
					+ "When you enter a new station, please remember the station number need to bigger than the numbers we have right now. "
					+ "\n If you just choose only one of green and red, please input the other one is -1");			
			String[] data =  in.nextLine().split(",");
			CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Integer.parseInt(data[5]), Integer.parseInt(data[6]));
			if((Integer.parseInt(data[5])>32 && Integer.parseInt(data[6])==-1) || (Integer.parseInt(data[6])>27 && Integer.parseInt(data[5])==-1) ||(Integer.parseInt(data[5])>32 && Integer.parseInt(data[6])>27)) {

				System.out.println("Please enter the index of object which you want:");
				Scanner input = new Scanner(System.in);
				int i = Integer.parseInt(input.nextLine());
				stops.add(i, instance);
				System.out.println(stops);
			}
			else {
				System.out.println("Sorry. Please follow the instructions.");
			}
			
		}catch (InputMismatchException e) {
			System.out.println("Input doesnot match the requirement");
		}catch (Exception e) {
				System.out.println("Something went wrong");
		}
		
		
	}
	
	public void displayStationNames() {
		for (int i=0; i<stops.size();i++) {
			System.out.println(stops.get(i).getName());
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
				for (int i=0; i<stops.size(); i++) {
					if (stops.get(i).haswheelchair()==true) {
						System.out.println(stops.get(i).getName());
					}
					
				}
				break;
			}
			else if (in.equalsIgnoreCase("n")) {
				for (int i=0; i<stops.size(); i++) {
					if (stops.get(i).haswheelchair()==false) {
						System.out.println(stops.get(i).getName());
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
	
	public void displaySpecificName() {
		System.out.println("Please enter the station name which you want to know the whole information for it.");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine(); 
		for (int i=0; i<stops.size(); i++) {
			if (a.equalsIgnoreCase(stops.get(i).getName())) {
				System.out.println(stops.get(i));
			}
//			else{
//				System.out.println("Sorry. Not found.");
//			}
		}
		input.close();
	}
	
	public void displayNeareststation() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a latitude: ");
			double lat = Double.parseDouble(input.nextLine());
			System.out.println("Please enter a longitude: ");
			double lng = Double.parseDouble(input.nextLine());
			double smallest = stops.get(0).calcDistance(lat,lng);
			int number = 0;
			for (int i=0; i<stops.size(); i++) {
				if (stops.get(i).calcDistance(lat, lng)<smallest) {
					smallest = stops.get(i).calcDistance(lat, lng);
					number = i;
				}
			}
			System.out.println("The nearest station is "+stops.get(number).getName()+"and"+" , the distance is "+smallest);
			input.close();
		}catch(NumberFormatException e) {
			System.out.println("Format is not match.");
		}
		
	}
	
	public void displayAllinformation() {
		for (int i=0; i<stops.size();i++) {
			System.out.println(stops.get(i));
		}
	}
	
	public void start() {
		int x = 0;
		String a;
		boolean done = false;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Please select the red line or green line.");
			a = input.nextLine();
			if (a.equalsIgnoreCase("red")) {
				stops = redline.getStops();
				break;
			}
			if (a.equalsIgnoreCase("green")) {
				stops = greenline.getStops();
				break;
			}
			else {
				System.out.println("Go back and choose again.");
			}
		}while(!a.equalsIgnoreCase("red")||!a.equalsIgnoreCase("green"));
		while(!done) {	
			readFile();
			System.out.println(stops);
			System.out.println("Menu");
			System.out.println("1. Display Station names.");
			System.out.println("2. Display with/without Wheelchair.");
			System.out.println("3. Display Nearest Station.");
			System.out.println("4. Display information for a station with a specific name");
			System.out.println("5. Display information for all stations");
			System.out.println("6. Add a new station");
			System.out.println("7. Delete an existing station");
			System.out.println("8. Insert a new station");
			System.out.println("9. Exit.");
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
			else if (in.equalsIgnoreCase("Specific station ")|| in.equalsIgnoreCase("4")) {
				x = 4;
			}
			else if (in.equalsIgnoreCase("All Stations.")|| in.equalsIgnoreCase("5")) {
				x = 5;
			}
			else if (in.equalsIgnoreCase("Add")|| in.equalsIgnoreCase("6")) {
				x = 6;
			}
			else if (in.equalsIgnoreCase("Delete")|| in.equalsIgnoreCase("7")) {
				x = 7;
			}
			else if (in.equalsIgnoreCase("Insert")|| in.equalsIgnoreCase("8")) {
				x = 8;
			}
			else if (in.equalsIgnoreCase("Exit.")|| in.equalsIgnoreCase("9")) {
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
				displayNeareststation();
				break;
			case 4:
				displaySpecificName();
				break;
			case 5:
				displayAllinformation();
				break;
			case 6:
				addStation();
				break;
			case 7:
				removeStation();
				break;
			case 8:
				insertStation();
				break;
			default:
				System.out.println("Bye.");
				break;
		}
		
		input.close();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		CTAapp cta = new CTAapp();
		cta.start();
	}
	
	
	
	
	
	
	
}
