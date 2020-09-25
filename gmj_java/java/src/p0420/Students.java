package p0420;

class Subject {
	private int subCode;
	private String subName;

	public Subject(int subCode, String subName) {
		this.subCode = subCode;
		this.subName = subName;
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + "]";
	}

}

public class Students extends Person {
	private Subject subjects;
	public Students(){}
	public Students(PersonType pt, String num, String name, String dept, String tel, Subject s) {
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
	
	public void 수강(){
		System.out.println("수강신청");
	}
	
	@Override
	public String toString() {
		return "Student [수강과목=" + subjects + ", type=" + type.getTypeName() + ", num=" + num + ", name=" 
					+ name + ", dept=" + dept + ", tel=" + tel + "]";
	}
	
}
