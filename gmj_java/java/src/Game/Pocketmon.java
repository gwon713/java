package Game;

public class Pocketmon {
	String name;
	int hp;
	int exp;
	int level=1;

	void 밥먹기() {
		System.out.println("밥먹음");
		hp += 5;
	}

	void 잠자기() {
		System.out.println("잠잠");
		hp += 10;
	}

	boolean 놀기() {
		System.out.println("논다");
		hp -= 8;
		exp += 10;
		levelCheck();
		return hpCheck();
	}

	boolean 운동하기() {
		System.out.println("운동함");
		hp -= 15;
		exp += 20;
		levelCheck();
		return hpCheck();
	}

	boolean hpCheck() {
		if (hp <= 0) {
			System.out.println("캐릭터 사망");
			return false;
		}
		return true;
	}

	void levelCheck() {
		if (exp >= 20) {
			level++;
			exp -= 20;
			System.out.println("레벨업");
		}
	}

	void printInfo() {
		System.out.println(name + " 상태정보");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}

	void setInfo() {
		name = "포켓몬";
		hp = 30;
		exp = 0;
		level = 1;
		
	}
}
