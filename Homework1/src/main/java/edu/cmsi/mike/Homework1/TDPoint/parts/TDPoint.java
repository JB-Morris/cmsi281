package edu.cmsi.mike.Homework1.TDPoint

public class TDPoint {
	//import java.awt.geom.Point2D.*;

	private static final double x = 5; //change later	

	private static final double y = 5; //change later

	private static final double p = 10;

	private static final double q = 10;

	
	//Displays point and checks for bad inputs
	public void displayPoint(double x, double y) {
		this.x = x;
		this.y = y;
			if(x < 0){
				throw IllegalArgumentException("x cannot be negative.");
			}
			if(y < 0){
				throw IllegalArgumentException("y cannot be negative.");
			}
		System.out.println("The point is (" x ", " y ")")

	
	}

	//Displays the distance betwee the two points specified
	public void displayDistance(double p, double q, double x, double y) {
		this.p = p;
		this.q = q;
		this.x = x;
		this.y = y;

		if(p == x && q == y){
			System.out.println("The points are Equal.");
		}
		else{
			double a = Math.abs(p - x);
			double b = Math.abs(q - y);
			double c = Math.sqrt(a*a + b*b);
			System.out.println("The distance between (" p ", " q ") " "and (" x ", " y ")" " is: " c " units.")
			//Commented out in case I choose to give this class a return type later
			//return c;
		}


	}	

}

