package Game;

public class Bulbasaur extends Pocketmon{
	void setInfo(){
		name = "�̻��ؾ�";
		hp = 35;
		exp = 0;
		level = 1;
	}
	void levelCheck() {
		if (exp >= 25) {
			level++;
			exp -= 25;
			System.out.println("������");
		}
	}
	void ����ä��(){
		System.out.println("����ä��");
	}
}
