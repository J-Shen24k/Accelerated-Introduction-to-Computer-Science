package exams.second.second;

public abstract class Box {
	
	private String name;
	
	public Box() {
		name = "";
	}
	
	public Box(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name;
	}
	
	public boolean equals(Box other) {
		return name.equals(other.getName());
	}
	
	public abstract void area();
	
	public abstract void volume();
}
