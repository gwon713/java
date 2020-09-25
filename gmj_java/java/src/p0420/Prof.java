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
	
	public void 개설(){
		System.out.println("과목개설");
	}

	@Override
	public String toString() {
		return "Prof [개설과목=" + subjects + ", type=" + type.getTypeName() + ", num=" + num + ", name=" + name + ", dept=" + dept
				+ ", tel=" + tel + "]";
	}
	
	
}
