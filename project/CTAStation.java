package project;
import java.util.ArrayList;
import java.util.HashMap;

import labs.lab5.GeoLocation;
/*
 *This class contains the attributes/properties of the station.  
 *It has a method to find out the color of the station.
 *also a dummy method to demonstrate polymorphism 
 */
public class CTAStation extends GeoLocation {
	//Declaring the instance variables (the attributes of a station)
	private String name;
	private boolean wheelchair;
	private String loc;
	private int red;
	private int green;
	private int blue;
	private int brown;
	private int purple;
	private int pink;
	private int orange;
	private int yellow;
	protected HashMap<String, Integer> colors = new HashMap<String, Integer>();
	
	
	public CTAStation() {
		// Default constructor
		super();
		name = "";
		loc = "";
		wheelchair = true;
		red = -1;
		green = -1;
		blue = -1;
		brown = -1;
		purple = -1;
		pink = -1;
		orange = -1;
		yellow = -1;
	}
	
	public CTAStation(String name, double lat, double lng, String loc, boolean wheelchair, int red, int green, int blue, int brown, int purple, int pink, int orange, int yellow) {
		// Non default constructor
		super(lat, lng);
		setName(name);
		setLocation(loc);
		setWheelchair(wheelchair);
		setRed(red);
		setGreen(green);
		setBlue(blue);
		setBrown(brown);
		setPurple(purple);
		setPink(pink);
		setOrange(orange);
		setYellow(yellow);
	}
	
	public String getName() {
		//Accessor for the Name
		return name;
	}

	public String getLocation() {
		//Accessor for the Location
		return loc;
	}
	
	public void setLocation(String loc) {
		//Mutator for the location
		this.loc = loc;
	}
	public void setName(String name) {
		//Mutator for the name
		this.name = name;
	}
	
	public int getRed() {
		//Accessor for the Red
		return red;
	}
	
	public void setRed(int red) {
		//Mutator for the Red
		this.red = red;
	}
	
	public int getGreen() {
		//Accessor for the Green
		return green;
	}
	
	public void setGreen(int green) {
		//Mutator for the Green
		this.green = green;
	}
	
	public int getBlue() {
		//Accessor for the Blue
		return blue;
	}
	
	public void setBlue(int blue) {
		//Mutator for the Blue
		this.blue = blue;
	}
	
	public int getBrown() {
		//Accessor for the Brown
		return brown;
	}
	
	public void setBrown(int brown) {
		//Mutator for the Brown
		this.brown = brown;
	}
	
	public int getPurple() {
		//Accessor for the Purple
		return purple;
	}
	
	public void setPurple(int purple) {
		//Mutator for the Purple
		this.purple = purple;
	}
	
	public int getPink() {
		//Accessor for the Pink
		return pink;
	}
	
	public void setPink(int pink) {
		//Mutator for the Pink
		this.pink = pink;
	}
	
	public int getOrange() {
		//Accessor for the Orange
		return orange;
	}
	
	public void setOrange(int orange) {
		//Mutator for the Orange		
		this.orange = orange;
	}
	
	public int getYellow() {
		//Accessor for the Yellow
		return yellow;
	}
	
	public void setYellow(int yellow) {
		//Mutator for the Yellow
		this.yellow = yellow;
	}
	
	public boolean haswheelchair() {
		//Accessor for the haswheelchair
		return wheelchair;
	}
	
	public void setWheelchair(boolean wheelchair) {
		//Mutator for the haswheelchair
		this.wheelchair = wheelchair;
	}
	public String toString() {
		//the to String method to display the information about the station
		String comma = ", ";
		return name+ comma +super.getLat()+ comma +super.getLng()+comma+loc+comma+wheelchair+comma+red+comma+ green+comma+blue+comma+brown+comma+purple+comma+pink+comma+orange+comma+yellow;
	}
	
	public boolean equals(CTAStation a) {
		//equals method
		return super.equals(a) && name.equals(a.getName()) && wheelchair == (a.haswheelchair()) && loc.equals(getLocation()) && red == (a.getRed())&& green == (a.getGreen()) && blue == (a.getBlue()) && brown == (a.getBrown()) && purple == (a.getPurple()) && pink == (a.getPink()) && orange == (a.getOrange()) && yellow == (a.getYellow());
	
	}
	
	public String color() { //method to find the color of the station
		ArrayList<String> stopnumbers= new ArrayList<String>(); //declaring a new array list 
		for(int i=0;i<8;i++){
			stopnumbers.add(""); //adding empty values to the list
		}
		// Verifying if the stop number is anything other than -1 and adding to the corresponding index in the list
		if (red != -1) {
			stopnumbers.set(0,"Red.");         
		}
		if (green != -1) {
			stopnumbers.set(1,"Green.");
		}
		if (blue != -1) {
			stopnumbers.set(2,"Blue.");
		}
		if (brown != -1) {
			stopnumbers.set(3,"Brown.");;
		}
		if (purple != -1) {
			stopnumbers.set(4,"Purple.");;
		}
		if (pink != -1) {
			stopnumbers.set(5,"Pink.");
		}
		if (orange != -1) {
			stopnumbers.set(6,"Orange.");
		}
		if (yellow != -1) {
			stopnumbers.set(7,"Yellow.");
		}
		//displaying all the elements of the list side by side
		return stopnumbers.get(0)+stopnumbers.get(1)+stopnumbers.get(2)+stopnumbers.get(3)+stopnumbers.get(4)+stopnumbers.get(5)+stopnumbers.get(6)+stopnumbers.get(7);
	}
}
