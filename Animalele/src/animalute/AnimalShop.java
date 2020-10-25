package animalute;

public class AnimalShop {

	private String shopName;
	private String location;
	private Dog dog1;
	private Cat cat;
	private Bird bird1;
	private Bird bird2;

	public void showAnimalForSale() {
		System.out.println(this.dog1.getName());
		System.out.println(this.cat.getName());
		System.out.println(this.bird1.getName());
		System.out.println(this.bird2.getName());
	}
	AnimalShop(String shopName,String location){
		this.shopName=shopName;
		this.location=location;
	}
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Dog getDog1() {
		return dog1;
	}

	public void setDog1(Dog dog1) {
		this.dog1 = dog1;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Bird getBird1() {
		return bird1;
	}

	public void setBird1(Bird bird1) {
		this.bird1 = bird1;
	}

	public Bird getBird2() {
		return bird2;
	}

	public void setBird2(Bird bird2) {
		this.bird2 = bird2;
	}

}
