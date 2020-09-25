package p0420;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s = new Staff(new PersonType(3, "교직원"),"st_1","교직원a","인사팀","1111","인사관리");
		Students ss = new Students(new PersonType(2, "학생"),"s_1","학생b","컴퓨터공학과","1234",new Subject(1,"전산학 개론"));
		Prof f = new Prof(new PersonType(1, "교수"),"p_1","교수c","컴퓨터공학과","7777",new Subject(2,"운영학 개론"));
		System.out.println(s);
		s.업무();
		System.out.println(ss);
		ss.수강();
		System.out.println(f);
		f.개설();
	}

}
