package p0420;

public class Staff extends Person {
	private String job;

	public Staff(PersonType pt, String num, String name, String dept, String tel, String job) {
		this.type = pt;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void ����() {
		System.out.println("��������");
	}

	@Override
	public String toString() {
		return "Staff [����=" + job + ", type=" + type.getTypeName() + ", num=" + num + ", name=" + name + ", dept="
				+ dept + ", tel=" + tel + "]";
	}

}
