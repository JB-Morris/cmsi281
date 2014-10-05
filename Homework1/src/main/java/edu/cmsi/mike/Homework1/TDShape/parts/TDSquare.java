package edu.cmsi.mike.Homework1.TDShape.parts;

public class TDSquare {

	private int side;
	private int xStart;
	private int yStart;

	public int getSide() {
		return this.side;
	}

	public int getX() {
		return this.xStart;
	}

	public int getY() {
		return this.yStart;
	}


	public int getArea() {

		int area = this.getSide() * this.getSide();

		System.out.println("The area is: " + area + ".");

		return area;
	}

	public int getPermiter() {

		int permiter = this.getSide() + this.getSide() + this.getSide() + this.getSide();

		return permiter;		
	}

	public boolean checkPoint(TDPoint point) {
		point.getX();
        point.getY();



		/*int x, y, s;

		x = i[2];
		y = i[3];
		s = side;

		xCheck = x2;
		yCheck = y2;

		if(x < x2 < (x + s) ) {
			if(y < y2 < (y + s)){
				System.out.println("The point is within the shape.");
				return true;
			}else {
				System.out.println("The point is not within the shape.");
				return false;
			}
		}else {
			System.out.println("The point is not within the shape.");
			return false;*/
		}






	}

	public int translate() {
		//some code
	}

	public int getBoundingRectangle() {

	}
}