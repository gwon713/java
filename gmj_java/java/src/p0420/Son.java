package p0420;

public class Son extends Father {//Father: 상속관계
	public void test() {
		System.out.println("method");
		System.out.println("b:" + b + "/c:" + c + "/d:" + d);// 상속관계여도 private은
																// 상속 못 받음
	}
}

class Other {
	private Father f;//Father: 포함관계

	public Other() {//생성자
		f = new Father();
	}

	public void test() {
		System.out.println("method");
		System.out.println("b:" + f.b + "/c:" + f.c + "/d:" + f.d);//디폴트, protected, public 멤버는 같은 패키지에서 접근가능
	}
}

//자바에서 상속은 단일상속만 가능(부모는 1개만 가능)








