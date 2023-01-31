package java_repeat.ch08;

public class VolumeEx {

	public static void main(String[] args) {

		Volume[] vol = new Volume[3];
		vol[0] = new TV();
		vol[1] = new Speaker();
		vol[2] = new Audio();
		
		for (Volume volume : vol) {
			volume.volumeUp();
			volume.volumeDown();
			if (volume instanceof TV) {
				((TV) volume).play();
			}
		}
		
	}

}
