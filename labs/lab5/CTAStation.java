package labs.lab5;
public class CTAStation extends GeoLocation {
	private String name;
	private boolean wheelchair;
	private String loc;
	private boolean opened;
	
	public CTAStation() {
		super();
		name = "";
		loc = "";
		wheelchair = true;
		opened = true;
	}
	
	public CTAStation(String name, double lat, double lng, String loc, boolean wheelchair, boolean opend) {
		super(lat, lng);
		setName(name);
		setLocation(loc);
		setOpened(opend);
		setWheelchair(wheelchair);
	}
	
	public String getName() {
		return name;
	}
	public boolean getOpened() {
		return opened;
	}
	public String getLocation() {
		return loc;
	}
	public void setOpened(boolean opend) {
		this.opened = opend;
	}
	public void setLocation(String loc) {
		this.loc = loc;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean haswheelchair() {
		return wheelchair;
	}
	
	public void setWheelchair(boolean wheelchair) {
		this.wheelchair = wheelchair;
	}
	public String toString() {
		String comma = ", ";
		return name+ comma +super.getLat()+ comma +super.getLng()+comma+loc+comma+wheelchair+comma+opened;
	}
	
	public boolean equals(CTAStation a) {
		return super.equals(a) && name.equals(a.getName()) && wheelchair == (a.haswheelchair()) && loc.equals(getLocation()) && opened == (a.getOpened());
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

