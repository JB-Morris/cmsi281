package edu.cmsi.mike.Homework1;
import  edu.cmsi.mike.Homework1.TDPoint.parts.TDPoint;
import edu.cmsi.mike.Homework1.TDLineSegment.TDLineSegment;
import edu.cmsi.mike.Homework1.TDShape.parts.TDSquare;

public class App {
	public static void public static void main(String[] args) {
		TDPoint point = new TDPoint();
		point.displayPoint();
		point.displayDistance();
		TDLineSegment line = new TDLineSegment();
		line.displayMidpoint();
		line.displayEquality();

		
	}
}