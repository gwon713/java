package Game;

public class Picachu extends Pocketmon{
	void setInfo(){
		name = "피카츄";
		hp = 30;
		exp = 0;
		level = 1;
	}
	void levelCheck() {
		if (exp >= 20) {
			level++;
			exp -= 20;
			System.out.println("레벨업");
		}
	}
	void 전기공격(){
		System.out.println("전기공격");
	}
}
