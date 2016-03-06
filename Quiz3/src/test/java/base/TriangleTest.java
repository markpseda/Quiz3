package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import base.Triangle;


public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getAreaTest() {
		double testside1 = 3.0;
		double testside2 = 4.0;
		double testside3 = 5.0;
		Triangle testT = new Triangle(testside1, testside2, testside3);
		double correctArea = 6.0;
		
		assertEquals(correctArea, testT.getArea(),.01);
	}
	
	@Test
	public void getPerimeterTest() {
		double testside1 = 2.76;
		double testside2 = 4.53;
		double testside3 = 5.29;
		Triangle testT = new Triangle(testside1, testside2, testside3);
		double correctPerimeter = 12.58;
		assertEquals(correctPerimeter, testT.getPerimeter(),.01);
	}

}
