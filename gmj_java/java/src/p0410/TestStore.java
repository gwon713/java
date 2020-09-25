package p0410;
//캡슐화 (DTO,VO)
class Product{
	int num,price,amount;
	String name;
	
	void setProduct(int n,String nm,int p,int a){
		num=n;
		name=nm;
		price=p;
		amount=a;
	}
	
	void printProduct(){
		System.out.println("-----제품 정보-----");
		System.out.println("제품 번호 : "+num);
		System.out.println("제품명 : "+name);
		System.out.println("가격  : "+price);
		System.out.println("수량 : "+amount);
	}
}
public class TestStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setProduct(1, "새우깡", 1000, 10);
		
		Product p2 = new Product();
		p2.setProduct(2, "감자깡", 2000, 12);
		
		Product p3 = new Product();
		p3.setProduct(3, "고구마깡", 1500, 15);
		
		p1.printProduct();
		p2.printProduct();
		p3.printProduct();
	}

}
