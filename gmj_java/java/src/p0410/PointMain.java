package p0410;
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
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] a = new Point[2];
		for(int i=0;i<a.length;i++){
			a[i]=new Point();
			a[i].setXY((i+1)*10, (i+1)*10);
			a[i].printXY();
		}
		
	}

}
