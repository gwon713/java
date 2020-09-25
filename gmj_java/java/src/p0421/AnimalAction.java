package p0421;

public class AnimalAction {

	public void action(Animal animal){
		animal.cry();
		if(animal instanceof Dog){
			((Dog) animal).run();
		}else if(animal instanceof Cat){
			((Cat) animal).grooming();
		}
	}

}
