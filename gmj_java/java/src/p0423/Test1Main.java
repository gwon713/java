package p0423;

import java.util.ArrayList;

public class Test1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add("aaa");
		a1.add("bbb");
		a1.add(0,"ccc");
		a1.add(1,"zzz");
			
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
		
		if(a1.contains("aaa")){
			System.out.println(a1.indexOf("aaa")+" ��ġ�� �ִ�");
		}else{
			System.out.println("����");
		}
		if(a1.contains("zzz")){
			System.out.println(a1.indexOf("zzz")+" ��ġ�� �ִ�");
		}else{
			System.out.println("����");
		}
		
		
		
		
		System.out.println("z ����");
		a1.remove("zzz");
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
		System.out.println("0���� ����");
		a1.remove(0);
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
		System.out.println("��ü ����");
		a1.clear();
		if(a1.isEmpty()){
			System.out.println("����Ʈ �������");
		}
		
		
	}

}
