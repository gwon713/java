package p0421;



class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
public class Shape {
	protected Point[] points;//좌표 원=1개 삼각형=3개 사각형=2개
	protected String name;//도형 이름
	public void draw(){
		System.out.println(name+"을 그린다");
	}
}
