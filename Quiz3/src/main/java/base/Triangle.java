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


	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}


	@Override
	public double getArea() {
		double hp = (this.getPerimeter() / 2); //half perimeter
				
		return(Math.sqrt(hp*(hp-side1)*(hp-side2)*(hp-side3))); //Heron's Formula
	}

	@Override
	public double getPerimeter() {
		return(side1 + side2 + side3);
	}
	
	@Override
	public String toString(){
		return("Triangle with sides of length " + side1 + ", " + side2 +
				", " + side3 + ".");
	}
	

}
