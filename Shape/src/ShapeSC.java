
public abstract class ShapeSC {

	protected double area;
	protected double perimeter;
	
	public abstract double findArea();
	public abstract double findPerimeter();
	@Override
	public String toString() {
		return "ShapeSC [area=" + area + ", perimeter=" + perimeter + "]";
	}
	
}
