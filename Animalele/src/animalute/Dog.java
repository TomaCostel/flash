package animalute;

public  class Dog extends Animal {

	public static final boolean HAS_PEDIGREE = true;

	private boolean makeNoise;
	
	void makeNoise(boolean makeNoise) {
		System.out.println("ham ham ");
	}
	Dog(){
		
	}
	Dog(String caine){
		caine="Baumi";
	}
	
	@Override
	public boolean isSleeping() {

		System.out.println("catelul doarme");
		return true;
	}

	public boolean getMakeNoise() {
		return makeNoise;
	}

	public void setMakeNoise(boolean faceZgomot) {
		this.makeNoise = faceZgomot;

	}

	public boolean isPlaying() {
		boolean x = isSleeping();
		if (x == true) {
			return false;
		} else {
			return true;
		}

	}
}