package Game;

public class Charmander extends Pocketmon{
	void setInfo(){
		name = "파이리";
		hp = 25;
		exp = 0;
		level = 1;
	}
	void levelCheck() {
		if (exp >= 15) {
			level++;
			exp -= 15;
			System.out.println("레벨업");
		}
	}
	void 화염방사(){
		System.out.println("화염방사");
	}
}
