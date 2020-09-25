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
	protected Point[] points;//��ǥ ��=1�� �ﰢ��=3�� �簢��=2��
	protected String name;//���� �̸�
	public void draw(){
		System.out.println(name+"�� �׸���");
	}
}
