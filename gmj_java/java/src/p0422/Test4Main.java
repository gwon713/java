package p0422;

public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �߻� ��");
		try{
			int x = 3/0;
		}catch(NullPointerException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("���� �߻� ��");
	}

}
