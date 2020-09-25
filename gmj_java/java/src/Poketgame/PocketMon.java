package Poketgame;

public class PocketMon {
	protected String name;
	protected int hp;
	protected int exp;
	protected int level=1;
	
	public void eat(){
		System.out.println(name+" 밥먹음");
	}
	public void sleep(){
		System.out.println(name+" 잠");
	}
	public boolean play(){
		System.out.println(name+" 놀기");
		return true;
	}
	public boolean exc(){
		System.out.println(name+" 운동함");
		return true;
	}
	public void levelCheck(){
		System.out.println(name+" 레벨체크");
	}
	void printInfo() {
		System.out.println(name + " 상태정보");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}
}
