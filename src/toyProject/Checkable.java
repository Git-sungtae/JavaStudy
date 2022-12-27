package toyProject;

public interface Checkable {
	boolean checkName(String name);
	boolean checkDate(int date);
	boolean checkTime(int time);
	void checkAttend(Checkable beaconCheck);

}

class Check {
	public final String[] name = {"장성태", "김영광", "김태산"};
	public final int date = 1227;
	public int time;
	public boolean attend = false;
}


class BeaconCheck extends Check implements Checkable{
	String name;
	int date;
	int time;
	
	BeaconCheck(String name, int date, int time){
		this.name = name;
		this.date = date;
		this.time = time;
	}
	
	@Override
	public void checkAttend(Checkable beaconCheck) {
		if(checkName(this.name)) {
			boolean result = (beaconCheck.checkDate(date)) && (beaconCheck.checkTime(date));
			if (result) {
				attend = true;
				System.out.println("출석되었습니다.");
			} else {
				attend = false;
				System.out.println("출석되지 않았습니다.");
			}
		}
		
	}
	
	
	@Override
	public boolean checkName(String name) {
		for (String value : super.name) {
			if(value.equals(this.name)) {
				System.out.println(name + "학생 확인되었습니다.");
				return true;
			}
		}
		System.out.println("학원생이 아닙니다.");
		return false;
	}

	@Override
	public boolean checkDate(int date) {
		if (date == super.date) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkTime(int time) {
		if(this.time>910) {return false;}
		return true;
	}

		
	
}