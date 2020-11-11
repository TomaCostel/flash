package animalute;

import enums.AnimalType;
import enums.Size;
import interfete.Vietuitoare;

public class Bird extends Animal implements Vietuitoare {

	private boolean canFly;
	private String name;

	private String countryOfOrigin;
	private boolean ciupeste;
	private AnimalType tipAnimal;
	private Size marimeaAnimal;

	
	public AnimalType getTipAnimal() {
		return tipAnimal;
	}

	public void setTipAnimal(AnimalType tipAnimal) {
		this.tipAnimal = tipAnimal;
	}

	public Size getMarimeaAnimal() {
		return marimeaAnimal;
	}

	public void setMarimeaAnimal(Size marimeaAnimal) {
		this.marimeaAnimal = marimeaAnimal;
	}

	Bird(String nume) {
		nume = "Eusari";
	}

	public boolean migreazaInAlteTari() {
		if (this.tipAnimal == AnimalType.SALBATIC && this.getAge() < 8) {
			return true;
		} else {
			return false;

		}
	}

	public void whichIsChildFriendly(Bird p) {

		if (this.ciupeste == false && (this.marimeaAnimal == Size.SMALL || this.marimeaAnimal == Size.MEDIUM)) {
			System.out.println("Pasarea" + this.name);

		} else if (p.isCiupeste() == false && this.ciupeste == false) {
			System.out.println("null");// ca daca pun null nu merge asa ca l -am scris.cred ca trebuia sa pun returnuri
										// si nu trebuia sa pun void
		} else if (p.isCiupeste() == true && this.ciupeste == true) {
			System.out.println(this.ciupeste);
		}
	}

	Bird() {

	}

	Bird(String name, int age) {
		this.name = name;
		this.setAge(age);

	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public boolean isCiupeste() {
		return ciupeste;
	}

	public void setCiupeste(boolean ciupeste) {
		this.ciupeste = ciupeste;
	}

	@Override
	public void respira() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat(int a) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasKids() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void makeNoise(boolean makeNoise) {
		// TODO Auto-generated method stub

	}

}
