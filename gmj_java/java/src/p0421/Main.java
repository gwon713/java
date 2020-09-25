package p0421;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] pC = {new Point(1,4)};
		Point[] pT = {new Point(3,4),new Point(1,4),new Point(6,2)};
		Point[] pR = {new Point(2,4),new Point(5,4)};
		Shape[] arr = { new Circle(pC,20),new Circle(new Point(1,2), 23),new Circle(1,2,3),
				new Triangle(pT),new Triangle(new Point(1,4),new Point(2,5),new Point(6,1)),
				new Triangle(1,3,4,6,5,2),new Rectangle(pR),new Rectangle(new Point(2,6),new Point(4,3)),
				new Rectangle(4,3,1,6)
				};
		for(Shape s:arr){
			s.draw();
		}
	}

}