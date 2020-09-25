package p0421;

public class Rectangle extends Shape{
	{ 
		name = "Rectangle";
	}
	public Rectangle(Point[] points){
		this.points = points;
	}
	public Rectangle(Point p1,Point p2){
		points = new Point[]{p1,p2};
	}
	public Rectangle(int x1,int y1,int x2,int y2){
		points = new Point[]{ new Point(x1,y1),new Point(x2,y2)};
	}
	public void draw(){
		super.draw();
		System.out.println(points[0]+" / "+points[1]);
	}
}
