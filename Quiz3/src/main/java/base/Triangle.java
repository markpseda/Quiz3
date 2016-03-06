package base;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public Triangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		return(side1 + side2 + side3);
	}

}
