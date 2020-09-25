package p0421;

public interface MyInter {
	int Max=100;
	void test1();
	void test2();
}
class MyInterImp1 implements MyInter{
	public void test1(){
		System.out.println("test1 Max:"+Max);
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}
	
}
