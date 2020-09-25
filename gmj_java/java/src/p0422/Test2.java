package p0422;
class T implements Cloneable{
	
	public T(){
		
	}
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i ,n1=0,n2=0,sub = 0;
//		int result=0;
//		String str = "123+45";
//		char op=' ';
//		for(i =0; i<str.length();i++){
//			char ch = str.charAt(i);
//			if(Character.isDigit(ch)){
//				n1=n1*10+(ch-'0');
//			}else {
//				op = ch;
//				sub = i;
//				break;
//			}
//		}
//		for(i=sub; i<str.length();i++){
//			char ch = str.charAt(i);
//			if(Character.isDigit(ch)){
//				n2=n2*10+(ch-'0');
//			}
//		}
//		
//		System.out.println(n1);
//		System.out.println(op);
//		System.out.println(n2);
//		System.out.println(n1+n2);
		
		
		String str = "123+45";
		int i;
		char op = 0;
		for(i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				op = ch;
			}
		}
		String x = new String(new char[]{op});
		String[] s = str.split(x);
		int[] nums = new int[3];
		for(i=0;i<2;i++){
			nums[i] = Integer.parseInt(s[i]);
		}
		nums[2]=nums[1]+nums[0];
		System.out.println(nums[0]);
		System.out.println(op);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
	}

}
