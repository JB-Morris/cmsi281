package edu.cmsi.mike.Homework1.TDLineSegment;


public class TDLineSegment {
	//include get midpoint, equality of self vs other line, returns whether or not it intersects with another line, returns the length of the line
	private double x1;
	private double y1;
	private double x2;
	private double y2;


    public double getX1() {
        return x1;
    }
    public double getY1() {
        return y1;
    }
    public double getX2() {
        return x2;
    }
    public double getY2() {
        return y2;
    }


    //set to return a point class later
	public void displayMidpoint() {

		double xm = (this.x1 + this.x2)/2;
		double ym = (this.y1 + this.y2)/2;

		System.out.println("The midpoint between (" + this.x1 + ", " + this.y1 + ") and (" + this.x2 + ", " + this.y2 + ") is: (" + xm + ", " + ym + ").");

        //return ;
	}

	public boolean displayEquality(TDLineSegment line2) {

        if(this.x1 == line2.getX1() && this.y1 == line2.getY1() && this.x2 == line2.getX2() && this.y2 == line2.getY2()) {
            return true;
        }else {return false;}
	}


	private double[] getEquation() {
		double A, B, C;
        A = this.getY2() - this.getY1();
        B = this.getX2() - this.getX1();
        C = A*this.getX1()+B*this.getY1();
        double[] equation;
        equation = new double[3];
        equation[0] = A;
        equation[1] = B;
        equation[2] = C;

        return equation;


	}

	public boolean checkInstersection(TDLineSegment line2){
        line2.getEquation();
        this.getEquation();



    }


	
}