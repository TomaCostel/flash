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

		

	

		System.out.println(HAS_PEDIGREE);
		
		Animal.drink();
		Animal.planeta = "is pe marte";
	
	}

}
