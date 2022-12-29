package playGround;

public class AttendCheckTest {

	public static void main(String[] args) {

		Checkable at;
		at = new BeaconCheck("장성태",1227,830);
		at.checkAttend(at);
		System.out.println("===================================");
		at = new BeaconCheck("박박박",1227,830);
		at.checkAttend(at);
		System.out.println("===================================");
		at = new BeaconCheck("김영광",1227,1000);
		at.checkAttend(at);
		System.out.println("===================================");
		at = new BeaconCheck("김태산",1228,900);
		at.checkAttend(at);
		
	}

}
