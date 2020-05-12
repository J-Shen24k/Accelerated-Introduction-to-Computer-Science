package project;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * This class is the main app class. Contains the user menu options
 * Has a method to read data from the file and store it in a list
 */



public class CTAapp {
	private CTARoute greenline = new CTARoute();
	private CTARoute redline = new CTARoute();
	private CTARoute blueline = new CTARoute();
	private CTARoute brownline = new CTARoute();	
	private CTARoute purpleline = new CTARoute();
	private CTARoute pinkline = new CTARoute();
	private CTARoute orangeline = new CTARoute();
	private CTARoute yellowline = new CTARoute();
	private CTARoute basic = new CTARoute();
	private ArrayList <CTAStation> stops;
	private String path = "";
	
	
	private Scanner sc = new Scanner(System.in);
	//method to read the given file
	public void readFile() { 
		
		try {
//			name of the file
			sc = new Scanner(new File("src/project/CTAStops.csv")); 
			sc.nextLine();
			while (sc.hasNext()) {
//				split the data with coma
				String[] data = sc.nextLine().split(",");
				CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Integer.parseInt(data[5]), Integer.parseInt(data[6]),Integer.parseInt(data[7]),Integer.parseInt(data[8]),Integer.parseInt(data[9]),Integer.parseInt(data[10]),Integer.parseInt(data[11]),Integer.parseInt(data[12]));
//				add the data to the list
				basic.addStation(instance);
//			According to the number add them to each line 
//			if the number equals to -1, it means there is no station on that color
				if (instance.getGreen() != -1) {
//					greenline
					greenline.addStation(instance);
				}
			
				if (instance.getRed() !=-1) {
//					redline
					redline.addStation(instance);
				}
				
				if (instance.getBlue() !=-1) {
//					blueline
					blueline.addStation(instance);
				}
				
				if (instance.getBrown() !=-1) {
//					brownline
					brownline.addStation(instance);
				}
				
				if (instance.getPurple() !=-1) {
//					purpleline
					purpleline.addStation(instance);
				}
				
				if (instance.getPink() !=-1) {
//					pinkline
					pinkline.addStation(instance);
				}
				
				if (instance.getOrange() !=-1) {
//					orangeline
					orangeline.addStation(instance);
				}
				
				if (instance.getYellow() !=-1) {
//					yellowline
					yellowline.addStation(instance);
				}
				
			}
			
//			After program reads the file, we order all the stations as their line number
//			that helps next steps
			for (int i = 1; i < redline.getStops().size(); i++) {
//				set the order for redline
				int j = i;
				
				while(j > 0 && redline.getStops().get(j-1).getRed() > redline.getStops().get(j).getRed()) {
					CTAStation temp = redline.getStops().get(j-1);
					redline.getStops().set(j-1, redline.getStops().get(j));
					redline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < greenline.getStops().size(); i++) {
//				set the order for greenline
				int j = i;
				
				while(j > 0 && greenline.getStops().get(j-1).getGreen() > greenline.getStops().get(j).getGreen()) {
					CTAStation temp = greenline.getStops().get(j-1);
					greenline.getStops().set(j-1, greenline.getStops().get(j));
					greenline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < blueline.getStops().size(); i++) {
//				set the order for blueline
				int j = i;
				
				while(j > 0 && blueline.getStops().get(j-1).getBlue() > blueline.getStops().get(j).getBlue()) {
					CTAStation temp = blueline.getStops().get(j-1);
					blueline.getStops().set(j-1, blueline.getStops().get(j));
					blueline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < brownline.getStops().size(); i++) {
//				set the order for brownline
				int j = i;
				
				while(j > 0 && brownline.getStops().get(j-1).getBrown() > brownline.getStops().get(j).getBrown()) {
					CTAStation temp = brownline.getStops().get(j-1);
					brownline.getStops().set(j-1, brownline.getStops().get(j));
					brownline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < purpleline.getStops().size(); i++) {
//				set the order for purpleline
				int j = i;
				
				while(j > 0 && purpleline.getStops().get(j-1).getPurple() > purpleline.getStops().get(j).getPurple()) {
					CTAStation temp = purpleline.getStops().get(j-1);
					purpleline.getStops().set(j-1, purpleline.getStops().get(j));
					purpleline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < pinkline.getStops().size(); i++) {
//				set the order for pinkline
				int j = i;
				
				while(j > 0 && pinkline.getStops().get(j-1).getPink() > pinkline.getStops().get(j).getPink()) {
					CTAStation temp = pinkline.getStops().get(j-1);
					pinkline.getStops().set(j-1, pinkline.getStops().get(j));
					pinkline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < orangeline.getStops().size(); i++) {
//				set the order for orangeline
				int j = i;
				
				while(j > 0 && orangeline.getStops().get(j-1).getOrange() > orangeline.getStops().get(j).getOrange()) {
					CTAStation temp = orangeline.getStops().get(j-1);
					orangeline.getStops().set(j-1, orangeline.getStops().get(j));
					orangeline.getStops().set(j, temp);
					j = j-1;
				}
				
				
			}
			
			for (int i = 1; i < yellowline.getStops().size(); i++) {
//				set the order for yellowline
				int j = i;
				
				while(j > 0 && yellowline.getStops().get(j-1).getYellow() > yellowline.getStops().get(j).getYellow()) {
					CTAStation temp = yellowline.getStops().get(j-1);
					yellowline.getStops().set(j-1, yellowline.getStops().get(j));
					yellowline.getStops().set(j, temp);
					j = j-1;
				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file is not found");
		}
	}

//	method to add station
	public void addStation() {
//		readline choose a line first
		selectLine();
		try {
//			let user follow the instuctions to input the information
			System.out.println("Please enter the variables in order with name, latitude, longitude, location, wheelchair, red, green, blue, brown, purple, pink, orange and yellow. \n "
					+ "Please using comma to seperate the variabes. \n Hint: System has 33 red stations, 28 green stations, 33 blue stations, 27 brown stations, 27 purple stations, 22 pink stations, 16 orange stations and 3 yellow stations now. "
					+ "When you enter a new station, please remember the station number need to bigger than the numbers we have right now. "
					+ "\n Please enter -1 if there is no station one the specific lines.");
			Scanner in = new Scanner(System.in);
			String[] data = in.nextLine().split(",");
//			avoid there are two more stations use the same station number
			CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Integer.parseInt(data[5]), Integer.parseInt(data[6]),Integer.parseInt(data[7]),Integer.parseInt(data[8]),Integer.parseInt(data[9]),Integer.parseInt(data[10]),Integer.parseInt(data[11]),Integer.parseInt(data[12]));
			if((Integer.parseInt(data[5])>32 || Integer.parseInt(data[5])==-1) && (Integer.parseInt(data[6])>27 || Integer.parseInt(data[6])==-1) && (Integer.parseInt(data[7])>32 || Integer.parseInt(data[7])==-1)&&(Integer.parseInt(data[8])>26 || Integer.parseInt(data[8])==-1)&&(Integer.parseInt(data[9])>26 || Integer.parseInt(data[9])==-1)&&(Integer.parseInt(data[10])>21 || Integer.parseInt(data[10])==-1)&&(Integer.parseInt(data[11])>16|| Integer.parseInt(data[11])==-1)&&(Integer.parseInt(data[12])>3 || Integer.parseInt(data[12])==-1)) {

			stops.add(instance);
			System.out.println(stops);
			}else {
				System.out.println("Please follow the instruction.");
			}
		} 
//		handling exceptions
		  catch (InputMismatchException e) {
			System.out.println("Input doesnot match the requirement");
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} 
	}

//	method to remove station
	public void removeStation() {
//		select a line color first
		selectLine();
		System.out.println("Please enter the name of station which you want to delete:");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
//		looking for the station name
		for (int i=0; i<stops.size(); i++) {
			if (a.equalsIgnoreCase(stops.get(i).getName())) {
				stops.remove(stops.get(i));
			}
		}
		input.close();
	}
//	method to insert station
	public void insertStation() {
//		select a line color first
		selectLine();
		try {	
//			ask the user to input information as instructions 
			System.out.println("Please enter the variables in order with name, latitude, longitude, location, wheelchair, red, green, blue, brown, purple, pink, orange and yellow. \n "
					+ "Please using comma to seperate the variabes. \n Hint: System has 33 red stations, 28 green stations, 33 blue stations, 27 brown stations, 27 purple stations, 22 pink stations, 16 orange stations and 3 yellow stations now. "
					+ "When you enter a new station, please remember the station number need to bigger than the numbers we have right now. "
					+ "\n Please enter -1 if there is no station one the specific lines.");
			Scanner in = new Scanner(System.in);
//			use coma split the data
			String[] data = in.nextLine().split(",");
//			
			CTAStation instance = new CTAStation(data[0],Double.parseDouble(data[1]),Double.parseDouble(data[2]),data[3], Boolean.parseBoolean(data[4]),Integer.parseInt(data[5]), Integer.parseInt(data[6]),Integer.parseInt(data[7]),Integer.parseInt(data[8]),Integer.parseInt(data[9]),Integer.parseInt(data[10]),Integer.parseInt(data[11]),Integer.parseInt(data[12]));
			if((Integer.parseInt(data[5])>32 || Integer.parseInt(data[5])==-1) && (Integer.parseInt(data[6])>27 || Integer.parseInt(data[6])==-1) && (Integer.parseInt(data[7])>32 || Integer.parseInt(data[7])==-1)&&(Integer.parseInt(data[8])>26 || Integer.parseInt(data[8])==-1)&&(Integer.parseInt(data[9])>26 || Integer.parseInt(data[9])==-1)&&(Integer.parseInt(data[10])>21 || Integer.parseInt(data[10])==-1)&&(Integer.parseInt(data[11])>16|| Integer.parseInt(data[11])==-1)&&(Integer.parseInt(data[12])>3 || Integer.parseInt(data[12])==-1)) {
//				ask user the index which they want to put the data
				System.out.println("Please enter the index of object which you want:");
				Scanner input = new Scanner(System.in);
				int i = Integer.parseInt(input.nextLine());
				stops.add(i, instance);
				System.out.println(stops);
			}else {
				System.out.println("Please follow the instruction.");
			}
			
		}
		//handling exceptions
		 catch (InputMismatchException e) {
			System.out.println("Input doesnot match the requirement");
		}catch (Exception e) {
				System.out.println("Something went wrong");
		}		
	}
//method to display all the station names	
	public void displayStationNames() {
		selectLine();
		for (int i=0; i<stops.size();i++) {
			System.out.println(stops.get(i).getName());
		}
	}
//	method to display the stations have wheelchair or not
	public void displayByWheelchair() {
//		select color of line
		selectLine();
//		'Y' display the stations have wheelchair
//		'N' display the stations have not wheelchair
		System.out.println("Please enter Y or N.");
		boolean finish = false;
		Scanner input = new Scanner(System.in);
		while(!finish) {
			String in = input.next();
			finish = true;
			if (in.equalsIgnoreCase("y")) {
//				have wheelchair
				for (int i=0; i<stops.size(); i++) {
					if (stops.get(i).haswheelchair()==true) {
						System.out.println(stops.get(i).getName());
					}
					
				}
				break;
			}
			else if (in.equalsIgnoreCase("n")) {
//				have no wheelchair
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
//	method to display the station which user wants to search
	public void displaySpecificName() {
		selectLine();
//		select the line color
		System.out.println("Please enter the station name which you want to know the whole information for it.");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine(); 
		try {
			for (int i=0; i<stops.size(); i++) {
//				Display the information about the staion which user inputs
				if (a.equalsIgnoreCase(stops.get(i).getName())) {
					System.out.println(stops.get(i));
				}
			}
		} //handling exceptions
		 catch (Exception e) {
			System.out.println("Error");
		}
		
	}
//  method to calculate the distance and show the nearest one to the user	
	public void displayNeareststation() {
		selectLine();
//		select the line color
		try {
			Scanner input = new Scanner(System.in);
//			ask user input the lat
			System.out.println("Please enter a latitude: ");
//			ask user input the lng
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
		} //handling exceptions
		 catch(NumberFormatException e) {
			System.out.println("Format is not match.");
		}
		
	}
//	method to display all the information of all the stations
	public void displayAllinformation() {
		selectLine();
		for (int i=0; i<stops.size();i++) {
			System.out.println(stops.get(i));
		}
	}
//	method to find a way from one station to the other
	public void createPath(int startindex, int destiindex) {
		String sta = "";
		String des = "";
		int count = 0;
		int transfernum =0;
		boolean done = false;
		stops = basic.getStops();
		Scanner input = new Scanner(System.in);
		do {
//			ask user to input the start station
			System.out.println("Please enter the start station:");
			sta = input.nextLine();
			for (int i=0; i<stops.size(); i++) {
				if (sta.equalsIgnoreCase(stops.get(i).getName())) {
//					path +=(i);
					startindex = i;
					done =true;
				}
			}
		}while(!done);
		done = false;
		do {
//			ask user to input the station which they want to go
			System.out.println("Please enter the destination: ");
			des = input.nextLine();
			for (int j=0; j<stops.size(); j++) {
				if (des.equalsIgnoreCase(stops.get(j).getName())) {
					destiindex = j;
					done = true;
				}
			}
		}while(!done );
//		get the color the input stations
		String sourceline = stops.get(startindex).color(); 
		String destline = stops.get(destiindex).color();

//		one situation of both start and destination are on the same line
		
//		both on red line
		if (sourceline.contains("Red") && destline.contains("Red")) {
			int m = stops.get(startindex).getRed();
			int n = stops.get(destiindex).getRed();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path += redline.getStops().get(i).getName()+(" RED ") ;
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(redline.getStops().get(i).getName()+(" RED ") );
				}
				
			}
			path +=("Both of them are on red line.");
			
		}
//		both on green line
		else if (sourceline.contains("Green") && destline.contains("Green ")) {
			int m = stops.get(startindex).getGreen();
			int n = stops.get(destiindex).getGreen();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(greenline.getStops().get(i).getName()+(" GREEN ") );
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(greenline.getStops().get(i).getName()+(" GREEN ") );
				}
				
			}
			path +=("Both of them are on green line.");
			
		}
//		both on blue line
		else if (sourceline.contains("Blue") && destline.contains("Blue")) {
			int m = stops.get(startindex).getBlue();
			int n = stops.get(destiindex).getBlue();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(blueline.getStops().get(i).getName()+(" BLUE ") );
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(blueline.getStops().get(i).getName()+(" BLUE "));
				}
				
			}
			path +=("Both of them are on Blue line.");
			
			
		}
//		both one brown line
		else if (sourceline.contains("Brown") && destline.contains("Brown")) {
			int m = stops.get(startindex).getBrown();
			int n = stops.get(destiindex).getBrown();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(brownline.getStops().get(i).getName()+(" BROWN ") );
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(brownline.getStops().get(i).getName()+(" BROWN ") );
				}
				
			}
			path +=("Both of them are on brown line.");
			
			
		}
//		both on purple line
		else if (sourceline.contains("Purple") && destline.contains("Purple")) {
			int m = stops.get(startindex).getPurple();
			int n = stops.get(destiindex).getPurple();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(purpleline.getStops().get(i).getName()+(" PURPLE ") );
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(purpleline.getStops().get(i).getName()+(" PURPLE ") );
				}
				
			}
			path +=("Both of them are on purple line.");
			
			
		}
//		both on pink line
		else if (sourceline.contains("Pink") && destline.contains("Pink")) {
			int m = stops.get(startindex).getPink();
			int n = stops.get(destiindex).getPink();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(pinkline.getStops().get(i).getName()+(" PINK ") );
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(pinkline.getStops().get(i).getName()+(" PINK "));
				}
				
			}
			path +=("Both of them are on pink line.");
			
			
		}
//		both on orange line
		else if (sourceline.contains("Orange") && destline.contains("Orange")) {
			int m = stops.get(startindex).getOrange();
			int n = stops.get(destiindex).getOrange();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(orangeline.getStops().get(i).getName()+(" ORANGE ") );
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(orangeline.getStops().get(i).getName()+(" ORANGE ") );
				}
				
			}
			path +=("Both of them are on orange line.");
			
			
		}
//		both on yellow line
		else if (sourceline.contains("Yellow") && destline.contains("Yellow")) {
			int m = stops.get(startindex).getYellow();
			int n = stops.get(destiindex).getYellow();
			if (m<n) {
				for (int i=m; i<n+1; i++) {
					path +=(yellowline.getStops().get(i).getName()+(" YELLOW "));
				}
				
			}
			else if (m>n) {
				for (int i=m; i>n-1; i--) {
					path +=(yellowline.getStops().get(i).getName()+(" YELLOW "));
				}
				
			}
			path +=("Both of them are on yellow line.");
			
			
		}

		
//		the situation of two stations on different line
		else {
			String sourceline1 = stops.get(startindex).color().split("[^a-zA-Z]")[0]; // the color of the source
			String destline1 = stops.get(destiindex).color().split("[^a-zA-Z]")[0]; // the color of the destline
			
//			red and pinkline
//			they donot have the direct way to go from one to the other so it needs transfer
			
//			start id red and dest is pink
			if((sourceline1.equalsIgnoreCase("Red") && destline1.equalsIgnoreCase("Pink")) || (destline1.equalsIgnoreCase("Red") && sourceline1.equalsIgnoreCase("Pink"))) {
				
				if (sourceline1.equalsIgnoreCase("Red") && destline1.equalsIgnoreCase("Pink")) {
					int m = stops.get(startindex).getRed();
					int n = stops.get(destiindex).getPink();

					if (m>23) {
						for (int i1=m; i1>=23; i1--) {
							path +=(redline.getStops().get(i1).getName()+(" RED ") );
							
						}
					}
					
					if (m<23) {
						for (int i1=m; i1<24; i1++) {
							path +=(redline.getStops().get(i1).getName()+(" RED ") );
						}
					}
					
					for (int i1=18; i1>=14; i1--) {
						path +=(greenline.getStops().get(i1).getName()+(" Green ") );
					}
					
					if (n>14) {
						for (int i1=14; i1<n+1; i1++) {
							path +=(pinkline.getStops().get(i1).getName()+(" Pink ") );
							
						}
					}
					if (n<14) {
						for (int i1=14; i1>=n; i1--) {
							path +=(pinkline.getStops().get(i1).getName()+(" Pink ") );
							
						}
					}
				}
//				pink is start and red is dest
				if (sourceline1.equalsIgnoreCase("Pink") && destline1.equalsIgnoreCase("Red")) {
					int m = stops.get(startindex).getPink();
					int n = stops.get(destiindex).getRed();
					
					if (m>14) {
						for (int i1=m; i1>=14; i1--) {
							path +=(pinkline.getStops().get(i1).getName()+(" Pink ") );
							
						}
					}
					if (m<14) {
						for (int i1=m; i1<=14; i1++) {
							path +=(pinkline.getStops().get(i1).getName()+(" Pink ") );
							
						}
					}
					
					for (int i1=14; i1<19; i1++) {
						path +=(greenline.getStops().get(i1).getName()+(" Green ") );
					}
					
					if (n>23) {
						for (int i1=23; i1<n+1; i1++) {
							path +=(redline.getStops().get(i1).getName()+(" RED ") );
							
						}
					}
					
					if (n<23) {
						for (int i1=23; i1>=n; i1--) {
							path +=(redline.getStops().get(i1).getName()+(" RED ") );
						}
					}
					
					
					
					
				}

				
//				there is no direct way from yellow to green, blue, brown, pink or orange
//				so they need transfer
				
			else if( (sourceline1.equalsIgnoreCase("Yellow") && ( destline1.equalsIgnoreCase("Green") || destline1.equalsIgnoreCase("Blue") || destline1.equalsIgnoreCase("Brown") || destline1.equalsIgnoreCase("Pink") || destline1.equalsIgnoreCase("Orange")) )    ||  (destline1.equalsIgnoreCase("Yellow") && ( sourceline1.equalsIgnoreCase("Green") || sourceline1.equalsIgnoreCase("Blue") || sourceline1.equalsIgnoreCase("Brown") || sourceline1.equalsIgnoreCase("Pink") || sourceline1.equalsIgnoreCase("Orange")) )){
//				start is yellow and dest is green, blue, brown, pink or orange
				if (sourceline1.equalsIgnoreCase("Yellow") && ( destline1.equalsIgnoreCase("Green") || destline1.equalsIgnoreCase("Blue") || destline1.equalsIgnoreCase("Brown") || destline1.equalsIgnoreCase("Pink") || destline1.equalsIgnoreCase("Orange")) ){
					int m = stops.get(startindex).getYellow();
					path +=(m);
					for (int i=m; i<yellowline.getStops().size(); i++) {
						path +=(yellowline.getStops().get(i).getName()+(" YELLOW "));
					}
					
//					transfer red first
					for (int i=0; i<24; i++) {
						path +=(redline.getStops().get(i).getName()+(" RED "));
					}
					
//					transfer to green line the way on green line
					if (destline1.equalsIgnoreCase("Green")) {
						int n = stops.get(destiindex).getGreen();
						if (n>18) {
							for(int i=18; i<n+1; i++) {
								path +=(greenline.getStops().get(i).getName()+(" GREEN "));
							}
						}
						else if (n<18) {
							for(int i=18; i>=n; i--) {
								path +=(greenline.getStops().get(i).getName()+(" GREEN "));
							}
						}
					}
//					if the dest on blue, brown, pink or orange
//					user needs to transfer to green line second
					else {
//						the stations on green line 
					}
						for (int i=18; i>=14; i--) {
							path +=(greenline.getStops().get(i).getName()+(" GREEN "));
						}
						
//						if dest is blue then transfer from green to blue
						if (destline1.equalsIgnoreCase("Blue")) {
							int n = stops.get(destiindex).getBlue();
							if (n>16) {
								for (int i=16; i<n+1; i++) {
									path +=(blueline.getStops().get(i).getName()+(" BLUE "));
								}
							}
							else if (n<16) {
								for (int i=16; i>=n; i--) {
									path +=(blueline.getStops().get(i).getName()+(" BLUE "));
								}
							}
						}
						
//						if dest is brown then transfer from green to brown
						else if (destline1.equalsIgnoreCase("Brown")) {
							int n = stops.get(destiindex).getBrown();
							for (int i=26; i>=n; i--) {
								path +=(brownline.getStops().get(i).getName()+(" BROWN "));
							}
						}
//						if dest is pink then transfer from green to pink
						else if (destline1.equalsIgnoreCase("Pink")) {
							int n = stops.get(destiindex).getPink();
							if (n>14) {
								for (int i=14; i<n+1; i++) {
									path +=(pinkline.getStops().get(i).getName()+(" PINK "));
								}
							}
							else if (n<14) {
								for (int i=14; i>=n; i--) {
									path +=(pinkline.getStops().get(i).getName()+(" PINK "));
								}
							}
						}
//						if dest is orange then transfer from green to orange
						else if (destline1.equalsIgnoreCase("Orange")) {
							int n = stops.get(destiindex).getOrange();
							if (n>12) {
								for (int i=12; i<n+1; i++) {
									path +=(orangeline.getStops().get(i).getName()+(" ORANGE "));
								}
							}
							else if (n<12) {
								for (int i=12; i>=n; i--) {
									path +=(orangeline.getStops().get(i).getName()+(" ORANGE "));
								}
							}
						}
						
					}
					
				}

//				dest is yellow and start is green, blue, brown, pink or orange
				else if (destline1.equalsIgnoreCase("Yellow") && (( sourceline1.equalsIgnoreCase("Green") || sourceline1.equalsIgnoreCase("Blue") || sourceline1.equalsIgnoreCase("Brown") || sourceline1.equalsIgnoreCase("Pink") || sourceline1.equalsIgnoreCase("Orange")) )){
					int n = stops.get(destiindex).getYellow();
//					start is green
					if (sourceline1.equalsIgnoreCase("Green")) {
						int m = stops.get(startindex).getGreen();
						if (m>18) {
							for(int i=m; i>=18; i--) {
								path +=(greenline.getStops().get(i).getName()+(" GREEN "));
							}
						}
						else if (m<18) {
							for(int i=m; i<19; i++) {
								path +=(greenline.getStops().get(i).getName()+(" GREEN "));
							}
						}
					}
					
//					start is blue, brown, pink or orange
					else {
						
//						start is blue
						if (sourceline1.equalsIgnoreCase("Blue")) {
							int m = stops.get(startindex).getBlue();
							if (m>16) {
								for(int i=m; i>=16; i--) {
									path +=(blueline.getStops().get(i).getName()+(" BLUE "));
								}
							}
							else if (m<16) {
								for(int i=m; i<17; i++) {
									path +=(blueline.getStops().get(i).getName()+(" BLUE "));
								}
							}
						}
						
//						start is brown
						else if (sourceline1.equalsIgnoreCase("Brown")) {
							int m = stops.get(startindex).getBrown();
							for (int i=m; i<brownline.getStops().size(); i++) {
								path +=(brownline.getStops().get(i).getName()+(" BROWN "));
							}
						}
						
//						start is pink
						else if (sourceline1.equalsIgnoreCase("Pink")) {
							int m = stops.get(startindex).getPink();
							if (m>14) {
								for(int i=m; i>=14; i--) {
									path +=(pinkline.getStops().get(i).getName()+(" PINK "));
								}
							}
							else if (m<14) {
								for(int i=m; i<15; i++) {
									path +=(pinkline.getStops().get(i).getName()+(" PINK "));
								}
							}
						}
						
//						start is orange
						else if (sourceline1.equalsIgnoreCase("Orange")) {
							int m = stops.get(startindex).getOrange();
							if (m>12) {
								for(int i=m; i>=12; i--) {
									path +=(orangeline.getStops().get(i).getName()+(" ORANGE "));
								}
							}
							else if (m<12) {
								for(int i=m; i<13; i++) {
									path +=(orangeline.getStops().get(i).getName()+(" ORANGE "));
								}
							}
						}
//						need to transfer to green line
						for (int i=14; i<19; i++) {
							path +=(greenline.getStops().get(i).getName()+(" GREEN "));
						}
					}
//					then transfer to red line
					for (int i=23; i>=0; i--) {
						path +=(redline.getStops().get(i).getName()+(" RED "));
					}
//					finally transfer to yellow line
					for (int i=2; i>=n; i--) {
						path +=(yellowline.getStops().get(i).getName()+(" YELLOW "));
					}
				}
			}

//			normal situations
			else {	
				for (int i=0; i<stops.size(); i++) {
					if (stops.get(i).color().contains(sourceline1) && stops.get(i).color().contains(destline1)) {
						path +=(i);
						transfernum = i;
//						start is red
						if (sourceline1.equalsIgnoreCase("Red")) {
							int m = stops.get(startindex).getRed();
							int n = stops.get(transfernum).getRed();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(redline.getStops().get(i1).getName()+(" RED ") );
								}
							
							}
							
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(redline.getStops().get(i1).getName()+(" RED "));
								}
								
							}
						
						}
						
//						start is green
						if (sourceline1.equalsIgnoreCase("Green")) {
							int m = stops.get(startindex).getGreen();
							int n = stops.get(transfernum).getGreen();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(greenline.getStops().get(i1).getName()+(" GREEN "));
								}
								
							}
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(greenline.getStops().get(i1).getName()+ (" GREEN "));
								}
								
							}
							
						}
						
//						start is blue
						if (sourceline1.equalsIgnoreCase("Blue")) {
							int m = stops.get(startindex).getBlue();
							int n = stops.get(transfernum).getBlue();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(blueline.getStops().get(i1).getName() + (" BLUE "));
								}
								
							}
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(blueline.getStops().get(i1).getName()+ (" BLUE ") );
								}
								
							}
							
						}
						
//						start is brown
						if (sourceline1.equalsIgnoreCase("Brown")) {
							int m = stops.get(startindex).getBrown();
							int n = stops.get(transfernum).getBrown();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(brownline.getStops().get(i1).getName() +(" BROWN "));
								}
								
							}
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(brownline.getStops().get(i1).getName() + (" BROWN "));
								}
							
							}
							
						}
						
//						start is purple
						if (sourceline1.equalsIgnoreCase("Purple")) {
							int m = stops.get(startindex).getPurple();
							int n = stops.get(transfernum).getPurple();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(purpleline.getStops().get(i1).getName()+(" PURPLE ") );
								}
								
							}
							
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(purpleline.getStops().get(i1).getName() +(" PURPLE "));
								}
								
							}
							
						}
						
//						start is pink
						if (sourceline1.equalsIgnoreCase("Pink")) {
							int m = stops.get(startindex).getPink();
							int n = stops.get(transfernum).getPink();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(pinkline.getStops().get(i1).getName() +(" PINK ") );
								}
								
							}
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(pinkline.getStops().get(i1).getName() + (" PINK "));
								}
								
							}
							
						}
//						start is orange
						if (sourceline1.equalsIgnoreCase("Orange")) {
							int m = stops.get(startindex).getOrange();
							int n = stops.get(transfernum).getOrange();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(orangeline.getStops().get(i1).getName()+(" ORANGE ") );
								}
								
							}
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(orangeline.getStops().get(i1).getName()+( " ORANGE ") );
								}
								
							}
							
						}
						
//						start is yellow
						if (sourceline1.equalsIgnoreCase("Yellow")) {
							int m = stops.get(startindex).getYellow();
							int n = stops.get(transfernum).getYellow();
							if (m<n) {
								for (int i1=m; i1<n+1; i1++) {
									path +=(yellowline.getStops().get(i1).getName() +(" YELLOW "));
								}
							
							}
							if (m>n) {
								for (int i1=m; i1>=n; i1--) {
									path +=(yellowline.getStops().get(i1).getName()+( " YELLOW ") );
								}
							
							}
							
						}
						
//						dest is red
						if (destline1.equalsIgnoreCase("Red")) {
							int m = stops.get(destiindex).getRed();
							int n = stops.get(transfernum).getRed();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) {
									path +=(redline.getStops().get(i1).getName()+(" RED " ) );
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(redline.getStops().get(i1).getName()+(" RED ") );
								}
								break;
							}
							
						}
						
//						dest is green
						if (destline1.equalsIgnoreCase("Green")) {
							int m = stops.get(destiindex).getGreen();
							int n = stops.get(transfernum).getGreen();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) {
									path +=(greenline.getStops().get(i1).getName()+ (" GREEN "));
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(greenline.getStops().get(i1).getName()+(" GREEN ") );
								}
								break;
							}
							
						}
						
//						dest is blue
						if (destline1.equalsIgnoreCase("Blue")) {
							int m = stops.get(destiindex).getBlue();
							int n = stops.get(transfernum).getBlue();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) {
									path +=(blueline.getStops().get(i1).getName() +(" BLUE "));
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(blueline.getStops().get(i1).getName()+ (" BLUE ") );
								}
								break;
							}
							
						}
//						dest is brown 
						if (destline1.equalsIgnoreCase("Brown")) {
							int m = stops.get(destiindex).getBrown();
							int n = stops.get(transfernum).getBrown();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) {
									path +=(brownline.getStops().get(i1).getName()+ (" BROWN ") );
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(brownline.getStops().get(i1).getName()+(" BROWN ") );
								}
								break;
							}
							
						}
						
//						dest is purple
						if (destline1.equalsIgnoreCase("Purple")) {
							int m = stops.get(destiindex).getPurple();
							int n = stops.get(transfernum).getPurple();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) {
									path +=(purpleline.getStops().get(i1).getName()+(" PURPLE ") );
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(purpleline.getStops().get(i1).getName()+(" PURPLE "));
								}
								break;
							}
							
						}
						
//						dest is pink
						if (destline1.equalsIgnoreCase("Pink")) {
							int m = stops.get(destiindex).getPink();
							int n = stops.get(transfernum).getPink();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) { 
									path +=(pinkline.getStops().get(i1).getName()+(" PINK ") );
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(pinkline.getStops().get(i1).getName()+(" PINK ") );
								}
								break;
							}
							
						}
						
//						dest is orange
						if (destline1.equalsIgnoreCase("Orange")) {
							int m = stops.get(destiindex).getOrange();
							int n = stops.get(transfernum).getOrange();
							if (m<n) {
								for (int i1=n; i1>=m; i1--) {
									path +=(orangeline.getStops().get(i1).getName()+(" ORANGE ") );
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(orangeline.getStops().get(i1).getName()+( " ORANGE ") );
								}
								break;
							}
							
						}
						
//						dest is yellow
						if (destline1.equalsIgnoreCase("Yellow")) {
							int m = stops.get(destiindex).getYellow();
							int n = stops.get(transfernum).getYellow();
							if (m<n) {
								
								for (int i1=n; i1>=m; i1--) {
									path +=(yellowline.getStops().get(i1).getName()+(" YELLOW ") );
								}
								break;
							}
							if (m>n) {
								for (int i1=n; i1<m+1; i1++) {
									path +=(yellowline.getStops().get(i1).getName()+(" YELLOW ") );
								}
								break;
							}
							
						}
					}	
				}
			}
		}
	}
//	method to select a line 
	public void selectLine() {
		String a;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the line you want: ");
			a = input.nextLine();
//			red line
			if (a.equalsIgnoreCase("red")) {
				stops = redline.getStops();
				break;
			}
//			green line
			else if (a.equalsIgnoreCase("green")) {
				stops = greenline.getStops();
				break;
			}
//			blue line
			else if (a.equalsIgnoreCase("blue")) {
				stops = blueline.getStops();
				break;
			}
//			brown line
			else if (a.equalsIgnoreCase("brown")) {
				stops = brownline.getStops();
				break;
			}
//			purple line
			else if (a.equalsIgnoreCase("purple")) {
				stops = purpleline.getStops();
				break;
			}
//			pink line
			else if (a.equalsIgnoreCase("pink")) {
				stops = pinkline.getStops();
				break;
			}
//			orange line
			else if (a.equalsIgnoreCase("orange")) {
				stops = orangeline.getStops();
				break;
			}
//			yellow line
			else if (a.equalsIgnoreCase("yellow")) {
				stops = yellowline.getStops();
				break;
			}
			
			else {
				System.out.println("Invalid input");
				
			}
		}while(!a.equalsIgnoreCase("red")||!a.equalsIgnoreCase("green") || !a.equalsIgnoreCase("blue")||!a.equalsIgnoreCase("brown") || !a.equalsIgnoreCase("purple")||!a.equalsIgnoreCase("pink") || !a.equalsIgnoreCase("orange")||!a.equalsIgnoreCase("yellow"));
	}

//	method to write output into file
	public void Writefile() {
		Scanner input = new Scanner(System.in);
		try {
			FileWriter output = new FileWriter("src/project/qwer.txt");
				System.out.print("Do you want to write all the output in 'qwer'  Y / N : ");
			    String n = input.next();
			    if (n.equalsIgnoreCase("Y")) {
					output.write(path);
					output.flush();
			    } 
			    else {
			    	System.out.println(path);
			    }
			
			
			
		} 
//		handle exception
		catch (Exception e) {
			System.out.println("Error");
		}
		
		
		
    }
	
	
	
	public void start() {
		int x = 0;
		boolean done = false;
		Scanner input = new Scanner(System.in);
//		read file
		readFile();
		while(!done) {	
//			menu options
			System.out.println("Menu");
			System.out.println("1. Display Station names.");
			System.out.println("2. Display with/without Wheelchair.");
			System.out.println("3. Display Nearest Station.");
			System.out.println("4. Display information for a station with a specific name");
			System.out.println("5. Display information for all stations");
			System.out.println("6. Add a new station");
			System.out.println("7. Delete an existing station");
			System.out.println("8. Insert a new station");
			System.out.println("9. Find a path.");
			System.out.println("10. Exit.");
			String in = input.nextLine();
//			done = true;
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
			else if (in.equalsIgnoreCase("Path")|| in.equalsIgnoreCase("9")) {
				x = 9;
			}
			else if (in.equalsIgnoreCase("Exit.")|| in.equalsIgnoreCase("10")) {
				System.out.println("Exit.");
				break;
			}
			else {
				done = false;
				
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
				case 9:
					createPath(x, x);
					Writefile();
					break;
				default:
					System.out.println("Bye.");
					break;
			}
		}
		
		input.close();
	}
	
	public static void main(String[] args) {
		CTAapp cta = new CTAapp();
		cta.start();
	}
	
	
	
	
	
	
	
}
