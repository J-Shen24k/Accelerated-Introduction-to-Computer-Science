package exams.second.second;

public class CylindricalBox extends Box{
	private double radius;
	private double height;
	
	public CylindricalBox() {
		super();
		radius = 1.00;
		height = 1.00;
	}
	
	public CylindricalBox(String name, double radius, double height) {
		super(name);
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "CylindricalBox [radius=" + radius + ", height=" + height + "]";
	}
	
	public boolean equals(CylindricalBox b) {
		if ( b.getRadius() > 0 && b.getHeight() > 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public void area() {
		System.out.println( 2 * 3.14 * getRadius() * getHeight() + 2 * 3.14 * getRadius() * getRadius() );
		
	}

	@Override
	public void volume() {
		System.out.println( 3.14 * getRadius() * getRadius() * getHeight());
		
	}
	
}
