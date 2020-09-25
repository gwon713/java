package p0421;

public class Triangle extends Shape{
	{ 
		name = "Triangle";
	}
	public Triangle(Point[] points){
		this.points = points;
	}
	public Triangle(Point p1,Point p2,Point p3){
		points = new Point[]{p1,p2,p3};
	}
	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
		points = new Point[]{ new Point(x1,y1),new Point(x2,y2),new Point(x3,y3)};
	}
	public void draw(){
		super.draw();
		System.out.println(points[0]+" / "+points[1]+" / "+points[2]);
	}
}
