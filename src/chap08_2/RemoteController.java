package chap08_2;

public abstract class RemoteController {
	public abstract void turnOn();
}

class Tv extends RemoteController{
	public void turnOn() {
		System.out.println("추상 TV turn On");
	}
}

class Audio extends RemoteController{
	public void turnOn() {
		System.out.println("추상 Audio turn On");
	}
}
