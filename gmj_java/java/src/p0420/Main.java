package p0420;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s = new Staff(new PersonType(3, "������"),"st_1","������a","�λ���","1111","�λ����");
		Students ss = new Students(new PersonType(2, "�л�"),"s_1","�л�b","��ǻ�Ͱ��а�","1234",new Subject(1,"������ ����"));
		Prof f = new Prof(new PersonType(1, "����"),"p_1","����c","��ǻ�Ͱ��а�","7777",new Subject(2,"��� ����"));
		System.out.println(s);
		s.����();
		System.out.println(ss);
		ss.����();
		System.out.println(f);
		f.����();
	}

}
