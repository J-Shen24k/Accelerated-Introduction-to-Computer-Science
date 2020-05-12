package exams.first;

public class Object {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Object() {
		length = 0;
		width = 0;
		area = 0;
		perimeter = 0;
	}
	
	public Object(double length, double width, double area, double perimeter) {
		setLength(length);
		setWidth(width);
		this.area = area;
		this.perimeter = perimeter;
	}
	
	public void setLength(double length) {
		if (length>0) {
			this.length = length;
		}
		else {
			this.length = 1;
		}
	}
	
	public void setWidth(double width) {
		if (width>0) {
			this.width = width;
		}
		else {
			this.width = 1;
		}
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	
	public String toString() {
		return "The length and width of rectangular are"+length+"and"+width+" ,and the area and perimeter are "+area+"and"+perimeter;
	}
	
	public Boolean equals(Object a) {
		return length==a.getLength() && width==a.getWidth() && area==a.getArea() && perimeter==a.getPerimeter();
	}
	
	public double haveArea() {
		return area = length * width;
	}
	
	public double havePerimeter() {
		return perimeter = 2*(length+width);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
