package p0409;

public class Test_function {
	static int f1(int num){
		int res;
		res = num*3;
		return res;
	}
	static void f2(String name){
		System.out.println(name+"´Ô ¹Ý°©½À´Ï´Ù.");
	}
	static char f3(int idx){
		char[] arr = {'a','b','c'};
		if(idx<0 || idx >= arr.length){
			return (char) -1;
		}
		return arr[idx];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = f1(3);
		f2("asdf");
		System.out.println("x:"+x);
		char y = f3(4);
		System.out.println("y:"+y);
	}

}
