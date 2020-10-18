package animalute;

public class Cat extends Animal implements Vietuitoare {

	private int noOfFeet;
	private String countryOfOrigin;
	private String color;
	private String name;

	
	@Override
	void makeNoise(boolean makeNoise) {
		System.out.println("miau  miau");
	}

	public int getNoOfFeet() {
		return noOfFeet;
	}

	public void setNoOfFeet(int numarPicior) {
		this.noOfFeet = numarPicior;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String regiunea) {
		this.countryOfOrigin = regiunea;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String culoare) {
		this.color = culoare;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String nume) {
		this.name = nume;
	}

	static void toarce() {
		System.out.println("pisica toarce");

	}

	@Override
	public void respira() {
		
		
	}

	@Override
	public boolean hasKids() {
		// TODO Auto-generated method stub
		return false;
	}

}
