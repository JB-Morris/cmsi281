package edu.cmsi.mike.Homework1.TDPoint

public class TDPoint {
	//import java.awt.geom.Point2D.*;

	private static final double x = 5; //change later	

	private static final double y = 5; //change later

	private static final double p = 10;

	private static final double q = 10;

	
	//constructor
	public Point(x, y) {
		this.x = x;
		this.y = y;
			if(x < 0){
				throw IllegalArgumentException("x cannot be negative.");
			}
			if(y < 0){
				throw IllegalArgumentException("y cannot be negative.");
			}

	
	}
	public distance(p, q, x, y) {
		this.p = p;
		this.q = q;
		this.x = x;
		this.y = y;

		if(p == x && q == y){
			system.out.println("The points are Equal");
		}
		else{
			int a = Math.abs(p - x);
			int b = Math.abs(q - y);
			int c = Math.sqrt(a*a + b*b);
			system.out.println("The distance between the points is: " c " units");
		}


	}	

}

