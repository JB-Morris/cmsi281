package edu.cmsi.mike.Homework1


public class TDLineSegment {
	//include get midpoint, equality of self vs other line, return's whether or not it intersects with another line, returns the length of the line
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double a1
	private double b1
	private double a2
	private double b2

	public void displayMidpoint(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

		double xm = (x1 + x2)/2
		double ym = (y1 + y2)/2

		System.out.println("The midpoint between (" x1 ", " y1 ") and (" x2 ", " y2 ") is: (" x3 ", " y3 ").")
	}

	public void displayEquality(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;


		l1 = calculateSlope(x1, y1, x2, y2);
		l2 = calculateSlope(a1, b1, a2, b2);


		if(l1 == l2) {
			System.out.println("The first and second line have equal slopes.");
		}else {
			System.out.println("The lines do not have equal slopes.");
		}
	}


	private double calculateSlope(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

		double rise = (y2 - y1);
		double run = (x2 - x1);
		double slope = rise/run;

		return slope;

	}

	private void checkInstersection()
	
}