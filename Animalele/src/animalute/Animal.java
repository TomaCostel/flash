package animalute;

import enums.AnimalType;
import enums.Type;
import enums.Type2;

public abstract class Animal {

	private String name;
	private int noOfFeet;
	private String countryOfOrigin;
	private boolean merge;
	private String color;
	private Type type;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AnimalType getTipAnimal() {
		return tipAnimal;
	}

	public void setTipAnimal(AnimalType tipAnimal) {
		this.tipAnimal = tipAnimal;
	}

	private Type2 type2;
	private AnimalType tipAnimal;

	abstract void makeNoise(boolean makeNoise);

	public String getColor() {
		System.out.println("culoarea este " + color);
		return color;
	}

	public void setColor(String culoare) {
		this.color = culoare;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type r) {
		this.type = r;
	}

	public Type2 getType2() {
		return type2;
	}

	public void setType2(Type2 x) {
		this.type2 = x;
	}

	public int getNoOfFeet() {
		System.out.println("Are  " + noOfFeet + " picioare");
		return noOfFeet;
	}

	public void setNoOfFeet(int numarDePicioare) {
		this.noOfFeet = numarDePicioare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public boolean isMerge() {
		return merge;
	}

	public void setMerge(boolean merge) {
		this.merge = merge;
	}

	Animal() {
		this.name = "Huanito";
	}

	Animal(String nume, int numarDePicioare) {
		System.out.println("Numele este" + nume + "Si are : " + numarDePicioare);
		this.name = nume;
		noOfFeet = numarDePicioare;
	}

	Animal(String nume) {
		System.out.println(nume);
		this.name = nume;
		nume = "Ezikiel";
		System.out.println(name + "--");
	}

	static void drink() {
		System.out.println("animalul bea");
	}

	void sleep() {
		System.out.println("animalul doarme");
	}

	boolean isSleeping() {
		if (merge == true) {
			System.out.println("animalul nu doarme");
			return false;
		} else {
			System.out.println("animalul doarme");
			return true;
		}
	}

	
	

}
