package p0410;
//ĸ��ȭ (DTO,VO)
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
		System.out.println("-----��ǰ ����-----");
		System.out.println("��ǰ ��ȣ : "+num);
		System.out.println("��ǰ�� : "+name);
		System.out.println("����  : "+price);
		System.out.println("���� : "+amount);
	}
}
public class TestStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setProduct(1, "�����", 1000, 10);
		
		Product p2 = new Product();
		p2.setProduct(2, "���ڱ�", 2000, 12);
		
		Product p3 = new Product();
		p3.setProduct(3, "������", 1500, 15);
		
		p1.printProduct();
		p2.printProduct();
		p3.printProduct();
	}

}
