package p0420;

public class Prof extends Person {
	private Subject subjects;
	
	public Prof(PersonType pt, String num, String name, String dept, String tel, Subject s) {
		this.type = pt;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		subjects = s;
	}

	public Subject getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}
	
	public void ����(){
		System.out.println("���񰳼�");
	}

	@Override
	public String toString() {
		return "Prof [��������=" + subjects + ", type=" + type.getTypeName() + ", num=" + num + ", name=" + name + ", dept=" + dept
				+ ", tel=" + tel + "]";
	}
	
	
}
