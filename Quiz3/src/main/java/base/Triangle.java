package base;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	/**
	 * Constructs a default triangle with side 
	 * lengths of 1.
	 */
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	/**
	 * Constructs a triangle with 3 different
	 * side lengths:
	 * @param side1 first side length
	 * @param side2 second side length
	 * @param side3 third side length
	 */
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/**
	 * Gets length of side1
	 * @return length of side1
	 */
	public double getSide1() {
		return side1;
	}
	
	/**
	 * Gets length of side2
	 * @return length of side2
	 */
	public double getSide2() {
		return side2;
	}
	
	/**
	 * Gets length of side3
	 * @return length of side3
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Method that calculates the area of
	 * a Triangle instance.
	 * @return the area value
	 */
	@Override
	public double getArea() {
		double hp = (this.getPerimeter() / 2); //half perimeter
				
		return(Math.sqrt(hp*(hp-side1)*(hp-side2)*(hp-side3))); //Heron's Formula
	}

	/**
	 * Method that calculates the perimeter of
	 * a Triangle instance.
	 * @return the perimeter value
	 */
	@Override
	public double getPerimeter() {
		return(side1 + side2 + side3);
	}
	
	/**
	 * Prints out a string detailing the Traingle
	 * with the length of each side.
	 */
	@Override
	public String toString(){
		return("Triangle with sides of length " + side1 + ", " + side2 +
				", and " + side3 + ".");
	}
	

}
