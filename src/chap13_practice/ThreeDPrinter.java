package chap13_practice;

public class ThreeDPrinter<T extends ProperMaterial>{
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}

	

}
