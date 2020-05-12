package labs.lab4;

public class GeoLocation {
	
	private double lat;
	private double lng;
	
	
//	Default Constructor
	public GeoLocation() {
		lat = 0;
		lng = 0;
	}
	
//	Non-default Constructor
	public GeoLocation(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}
	
//	Accessors(Getters)
	public double getLat() {
		return lat;
	}
	
	public double getLng() {
		return lng;
	}
	
//	Mutators(Setters)
	public void setLat(Double lat) {
		this.lat = lat;
	}
	
	public void setLng(Double lng) {
		this.lng = lng;
	}
	
//	ToString method
	public String toString() {
		return "("+lat+","+lng+")";
	}
	
//	Boolean
	public boolean latbetween() {
		return (lat >= -90) && (lat <= 90);
	}
	
	public boolean lngbetween() {
		return (lng >= -180) && (lng <= 180);	
	}
	public double calcDistance(double lat, double lng) {
		double distance = Math.sqrt(Math.pow(lat-this.lat,2)+Math.pow(lng-this.lng,2));
		return distance;
	}
	public double calcDistance(GeoLocation a) {
		double distance = Math.sqrt(Math.pow(a.getLat()-this.lat,2)+Math.pow(a.getLng()-this.lng,2));
		return distance;
	}
	
	
	
	
	
	
}
