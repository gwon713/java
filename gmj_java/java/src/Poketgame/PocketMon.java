package Poketgame;

public class PocketMon {
	protected String name;
	protected int hp;
	protected int exp;
	protected int level=1;
	
	public void eat(){
		System.out.println(name+" �����");
	}
	public void sleep(){
		System.out.println(name+" ��");
	}
	public boolean play(){
		System.out.println(name+" ���");
		return true;
	}
	public boolean exc(){
		System.out.println(name+" ���");
		return true;
	}
	public void levelCheck(){
		System.out.println(name+" ����üũ");
	}
	void printInfo() {
		System.out.println(name + " ��������");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}
}
