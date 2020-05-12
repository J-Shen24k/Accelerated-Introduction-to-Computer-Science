package exams.second.second;

public class RectangularBox extends Box{
	

	private double height;
	private double width;
	private double depth;
	
	public RectangularBox() {
		super();
		height = 1.00;
		width = 1.00;
		depth = 1.00;
	}
	
	public RectangularBox(String name, double height, double width, double depth) {
		super(name);
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getDepth() {
		return depth;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "RectangularBox [height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}
	
	public boolean equals(RectangularBox a) {
		if (a.getDepth() > 0 && a.getHeight() > 0 && a.getWidth() > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void area() {
		System.out.println( getHeight() * getWidth() * 2 + getHeight() * getDepth() * 2 + getWidth() * getDepth() * 2 );
	}

	@Override
	public void volume() {
		System.out.println( getHeight() * getWidth() * getDepth() );
	}

	
}
