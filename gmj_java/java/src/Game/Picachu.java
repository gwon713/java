package Game;

public class Picachu extends Pocketmon{
	void setInfo(){
		name = "��ī��";
		hp = 30;
		exp = 0;
		level = 1;
	}
	void levelCheck() {
		if (exp >= 20) {
			level++;
			exp -= 20;
			System.out.println("������");
		}
	}
	void �������(){
		System.out.println("�������");
	}
}
