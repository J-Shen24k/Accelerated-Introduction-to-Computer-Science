package labs.lab6;
import labs.lab5.GeoLocation;
import labs.lab6.CTAStation;
import java.util.ArrayList;


public class CTARoute {
	private ArrayList <CTAStation> stops = new ArrayList<CTAStation>(); 
	private String name;
	
	public CTARoute() {
		stops = new ArrayList<>();
		name = "";
	}
	
	public CTARoute(String name, ArrayList<CTAStation>list){
		this.stops = list;
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<CTAStation> getStops(){
		return stops;
	}
	
	public void setStops(ArrayList<CTAStation>list) {
		this.stops = list;
	}
	
	public String toString() {
		String comma = ", ";
		return name + comma + stops;
	}
	
	public boolean equals(CTARoute a) {
		return name.equals(a.getName()) && stops.equals(a.getStops());
		
	}

	public void addStation(CTAStation stop) {
		stops.add(stop);
	}
	
	public void removeStation(CTAStation stop) {
		stops.remove(stop);
	}
	
	public void insertStation(int i, CTAStation stop) {
		stops.add(i, stop);
	}
	
	public CTAStation lookupStation(String name) {
		for (int i=0; i<stops.size(); i++ ) {
			if (name.equals(stops.get(i).getName())) {
				return stops.get(i);
			}
		}
		return null;
	}
	
	public CTAStation nearestStation(double lat, double lng) {
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
