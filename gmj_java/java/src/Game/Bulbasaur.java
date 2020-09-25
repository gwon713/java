package Game;

public class Bulbasaur extends Pocketmon{
	void setInfo(){
		name = "ÀÌ»óÇØ¾¾";
		hp = 35;
		exp = 0;
		level = 1;
	}
	void levelCheck() {
		if (exp >= 25) {
			level++;
			exp -= 25;
			System.out.println("·¹º§¾÷");
		}
	}
	void µ¢ÄğÃ¤Âï(){
		System.out.println("µ¢ÄğÃ¤Âï");
	}
}
