package project;

import labs.lab5.GeoLocation;
import project.CTAStation;
import java.util.ArrayList;
/*
 * This class contains all the major methods,
 * required to manipulate the values of the stations ability to add/delete.
 * stations
 */

public class CTARoute {
	private ArrayList <CTAStation> stops = new ArrayList<CTAStation>(); 
	private String name;
	
	public CTARoute() {
		// Default constructor
		stops = new ArrayList<>();
		name = "";

	}
	
	public CTARoute(String name, ArrayList<CTAStation>list, String linecolor, int linecolorindex){
		// Non default constructor
		this.stops = list;
		setName(name);

	}
	
	public String getName() {
		//Accessor for the Name
		return name;
	}
	
	public void setName(String name) {
		//Mutators for the Name
		this.name = name;
	}
	
	public ArrayList<CTAStation> getStops(){
		//Accessor for the stops
		return stops;
	}
	
	public void setStops(ArrayList<CTAStation>list) {
		//Mutators for the stops
		this.stops = list;
	}
	
	public String toString() {
		//the to String method to display the information about the station
		String comma = ", ";
		return name + comma + stops + comma;
	}
	
	public boolean equals(CTARoute a) {
		//equals method
		return name.equals(a.getName()) && stops.equals(a.getStops());
		
	}

	public void addStation(CTAStation stop) {
		// method to add station to the list
		stops.add(stop);
	}
	
	public void removeStation(CTAStation stop) {
		//method to remove station from the list
		stops.remove(stop);
	}
	
	public void insertStation(int i, CTAStation stop) {
		// method to insert station to the list
		stops.add(i, stop);
	}
	
	public CTAStation lookupStation(String name) {
		// method to search information of specific station
		for (int i=0; i<stops.size(); i++ ) {
			if (name.equals(stops.get(i).getName())) {
				return stops.get(i);
			}
		}
		return null;
	}
	
	public CTAStation nearestStation(double lat, double lng) {
		// method to the nearest station to the location
		double smallest = stops.get(0).calcDistance(lat,lng);
		int number = 0;
		for (int i=0; i<stops.size(); i++) {
			if (stops.get(i).calcDistance(lat, lng)<smallest) {
				smallest = stops.get(i).calcDistance(lat, lng);
				number = i;
			}
		}
		return stops.get(number);
	}
	
	public CTAStation nearestStation(GeoLocation a ) {
		// method to the nearest station to the location
		double smallest = stops.get(0).calcDistance(a);
		int number = 0;
		for (int i=0; i<stops.size(); i++) {
			if (stops.get(i).calcDistance(a)<smallest) {
				smallest = stops.get(i).calcDistance(a);
				number = i;
			}
		}
		return stops.get(number);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

