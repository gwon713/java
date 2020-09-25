package p0420;
class Car{
	String name;
	
	public void beep(){
		System.out.println("»§»§");
	}
}
class ¼Ò¹æÂ÷ extends Car{
	public ¼Ò¹æÂ÷(){
		name = "¼Ò¹æÂ÷";
	}

	@Override
	public void beep() {
		System.out.println("¾Ö~~~~~~¾Þ");
	}
}
class ±¼»è±â extends Car{
	public ±¼»è±â(){
		name = "±¼»è±â";
	}

	@Override
	public void beep() {
		System.out.println("¶¥ÆÄ ¶¥ÆÄ");
	}
}
class ¿¥ºæ·±½º extends Car{
	public ¿¥ºæ·±½º(){
		name = "¿¥ºæ·±½º";
	}

	@Override
	public void beep() {
		System.out.println("»ß¿À»ß¿À");
	}
}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = null;
		c = new ¿¥ºæ·±½º();
		c.beep();
	}

}
