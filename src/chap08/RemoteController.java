package chap08;

public interface RemoteController {
	public void turnOn();

}

class Tv implements RemoteController{
	public void turnOn() {
		System.out.println("인터 TV turn On");
	}
}

class Audio implements RemoteController{
	public void turnOn() {
		System.out.println("인터 Audio turn On");
	}
}