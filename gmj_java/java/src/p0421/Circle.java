package p0421;

public class Circle extends Shape {
	private int r;
	{
		name = "circle";
	}
	public Circle(Point[] points, int r){
		this.points = points;
		this.r = r;
	}
	public Circle(Point p, int r){
		points = new Point[]{p};
		this.r = r;
	}
	public Circle(int x,int y,int r){
		points = new Point[]{ new Point(x,y)};
		this.r = r;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void draw(){
		super.draw();
		System.out.println(points[0]+" / ¹ÝÁö¸§ : "+r);
	}
}
