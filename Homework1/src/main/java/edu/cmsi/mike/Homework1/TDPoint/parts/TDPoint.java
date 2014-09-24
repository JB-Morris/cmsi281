package edu.cmsi.mike.Homework1.TDPoint.parts;

public class TDPoint {
	//import java.awt.geom.Point2D.*;

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}



	//Displays point and checks for bad inputs
	public String displayPoint() {

        return "The point is (" + x + ", " + y + ")";
	}

	//Displays the distance between the two points specified
	public double displayDistance(TDPoint point2) {
		double p;
        double q;
		point2.getX() = p;
		point2.getY() = q;

		if(p == this.x && q == this.y){
			System.out.println("The points are Equal.");
            double c = 0;
            return c;
		}
		else{
			double a = Math.abs(p - x);
			double b = Math.abs(q - y);
			double c = Math.sqrt(a*a + b*b);
			System.out.println("The distance between (" + p + ", " + q + ") and (" + x + ", " + y + ") is: " + c + " units.");
			//Commented out in case I choose to give this class a return type later
			return c;
		}


	}	

}

