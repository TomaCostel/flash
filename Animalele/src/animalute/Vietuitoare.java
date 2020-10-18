package animalute;

abstract  interface Vietuitoare {

	abstract void respira();//oricum era public 

	static void eat(int a) {
		System.out.println("animalul manaca");
	}

	abstract  boolean hasKids();
		
	
	
}
