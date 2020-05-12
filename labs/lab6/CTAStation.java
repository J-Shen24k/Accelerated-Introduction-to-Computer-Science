package labs.lab6;
import labs.lab5.GeoLocation;

public class CTAStation extends GeoLocation {
	private String name;
	private boolean wheelchair;
	private String loc;
	private int red;
	private int green;
	
	public CTAStation() {
		super();
		name = "";
		loc = "";
		wheelchair = true;
		red = -1;
		green = -1;
	}
	
	public CTAStation(String name, double lat, double lng, String loc, boolean wheelchair, int red, int green) {
		super(lat, lng);
		setName(name);
		setLocation(loc);
		setWheelchair(wheelchair);
		setRed(red);
		setGreen(green);
	}
	
	public String getName() {
		return name;
	}

	public String getLocation() {
		return loc;
	}
	
	public void setLocation(String loc) {
		this.loc = loc;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRed() {
		return red;
	}
	
	public void setRed(int red) {
		this.red = red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public void setGreen(int green) {
		this.green = green;
	}
	
	public boolean haswheelchair() {
		return wheelchair;
	}
	
	public void setWheelchair(boolean wheelchair) {
		this.wheelchair = wheelchair;
	}
	public String toString() {
		String comma = ", ";
		return name+ comma +super.getLat()+ comma +super.getLng()+comma+loc+comma+wheelchair+comma+red+comma+ green;
	}
	
	public boolean equals(CTAStation a) {
		return super.equals(a) && name.equals(a.getName()) && wheelchair == (a.haswheelchair()) && loc.equals(getLocation()) && red == (a.getRed())&& green == (a.getGreen());
	
	}

}