package animalute;

import enums.AnimalType;
import enums.Size;

public abstract class Bird implements Vietuitoare {

	private boolean canFly;
	private String name;
	private int age;
	private String countryOfOrigin;
	private String colour;
	private boolean ciupeste;
	private AnimalType tipAnimal;
	private Size marimeaAnimal;

	public boolean migreazaInAlteTari() {
		if (this.tipAnimal == tipAnimal.SALBATIC && this.age < 8) {
			return true;
		} else
			return false;

	}

	Bird() {

	}

	Bird(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isCiupeste() {
		return ciupeste;
	}

	public void setCiupeste(boolean ciupeste) {
		this.ciupeste = ciupeste;
	}

}
