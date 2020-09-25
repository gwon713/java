package p0423;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("aaa");
		a1.add("bbb");
		a1.add("ccc");
		a1.add("ddd");
		
		Iterator<String> it = a1.iterator();
		//Enumeration a
		while(it.hasNext()){//다음 요소가 있으면 true 없으먼 false Enumeration:hasMoreElements()
			System.out.println(it.next());//다음방에 방문하여 요소 추출 Enumeration: nextElements()
		}
		for(String s:a1){
			System.out.println(s);
		}
	}

}
