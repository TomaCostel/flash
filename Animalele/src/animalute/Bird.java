package animalute;

import enums.AnimalType;
import enums.Size;
import interfete.Vietuitoare;

public class Bird implements Vietuitoare {

	private boolean canFly;
	private String name;
	private int age;
	private String countryOfOrigin;
	private String colour;
	private boolean ciupeste;
	private AnimalType tipAnimal;
	private Size marimeaAnimal;
	private boolean childFriendly;

	Bird(String nume) {
		nume = "Eusari";
	}

	public boolean migreazaInAlteTari() {
		if (this.tipAnimal == AnimalType.SALBATIC && this.age < 8) {
			return true;
		} else {
			return false;

		}
	}

	public boolean isChildFriendly() {
		return childFriendly;
	}

	public void setChildFriendly(boolean childFriendly) {
		this.childFriendly = childFriendly;
	}

	public void whichIsChildFriendly(Bird p) {

		if (this.ciupeste == false && (this.marimeaAnimal==Size.SMALL || this.marimeaAnimal==Size.MEDIUM)) {
			System.out.println("Pasarea"+this.name);
		}
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

}
