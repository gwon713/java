package Poketgame;

public class Picachu extends PocketMon {
	public Picachu(){
		name = "피카츄";
		hp = 30;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		hp+=5;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
		hp+=8;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		super.play();
		hp-=10;
		exp+=8;
		levelCheck();
		return hp>0;
	}

	@Override
	public boolean exc() {
		// TODO Auto-generated method stub
		super.exc();
		hp-=15;
		exp+=15;
		levelCheck();
		return hp>0;
	}

	@Override
	public void levelCheck() {
		// TODO Auto-generated method stub
		super.levelCheck();
		if(exp>=30){
			level++;
			exp-=30;
			System.out.println(name+" 레벨이 1 올라감");
		}
	}

}
