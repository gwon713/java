package p0421;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalAction a = new AnimalAction();
		Dog d = new Dog();
		d.name = "강아지";
		a.action(d);
		System.out.println("==============");
		
		Cat c = new Cat();
		c.name = "고양이";
		a.action(c);
	
	}

}
