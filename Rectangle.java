
public class Rectangle {

	private double length;
	private double width;
	
	
	public Rectangle() {
		length=0;
		width=0;
		
	}
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
		
	}
	public void setLength(double length) {
		this.length=length;
	}
	public void setWidth(double width) {
		this.width=width;
		
	}
	public void setLength_Width(double length, double width) {
		this.width=width;
		this.length=length;
	}
	
	public double getLength()
	{
		return length;
		
	}
	public double getWidth() {
		return width;
	}
	public double findArea() {
		return length*width;
	}
	public double findPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return length +" is length & " + width+" is width ";
	}
	//i tried by myself didnt go through it
	/*public boolean equals(Object o) {
		if(this==o) {
			return true;
			
			
		}
		if(o==null) {
			return false;
			
		}
		else if(!(o instanceof Rectangle)) {
			return false;
		}
		Rectangle r=(Rectangle) o;
		return  
		
		
		
	}*/
}
