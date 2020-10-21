package animalute;

import static animalute.Dog.HAS_PEDIGREE;

public class Main {
	static boolean  canBeAdopted(Bird p ) {
		if( p.getAge()<3) {
			return true;
		}
		else
			System.out.println("Pasarea  "+p.getName()+"nu poate fi adoptata");
			return false;//aici nu stiu cum sa o pun static,daca ii pun void nu va mai returna nimci asadar am facut boolean 
	}
	public static void main(String[] args) {

		Animal animal1 = new Dog();

		Animal animal3 = new Dog();
		animal1.setName("Leon");

		System.out.println(animal1.getName());
		System.out.println(animal3.getName());

		System.out.println(HAS_PEDIGREE);
		System.out.println(animal3);
		Animal.drink();
		Animal.planeta = "is pe marte";
		Dog catel = new Dog();
		catel.setCountryOfOrigin("Romania");
		catel.setMerge(true);
		catel.setMakeNoise(false);
	}

}
