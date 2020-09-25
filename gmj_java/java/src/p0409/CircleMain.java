package p0409;
class Point{
	int x,y;
	
	void setXY(int a,int b){
		x=a;
		y=b;
	}
	void printXY(){
		System.out.print("("+x+","+y+")");
	}
}
class Circle{
	Point p = new Point();
	int r;
	
	void setCircle(int x,int y,int z){
		p.setXY(x, y);
		r=z;	
	}
	
	void draw(){
		System.out.print("중심점 :");
		p.printXY();
		System.out.println("에 반지름 :"+r+"로 원 그림");
		
	}
}
public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setCircle(100, 200, 50);
		c.draw();
	}

}
