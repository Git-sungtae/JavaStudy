package chap02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int in = 128;
		byte by = (byte) in;
		System.out.println(by+"\n");
//		바이트읩 범위를 벗어났으므로 최소값부터 다시 할당됨
		
		int i = -200;
		if (i>127 || i<-128) {
			System.out.println("허용범위초과\n");
		} else {
			byte b = (byte) i;
			System.out.println(b+"\n");
			
		}
//		벗어나지 않는 경우에만 캐스팅
		
		int i2 = 200;
		if (i2>Byte.MAX_VALUE || i2<Byte.MIN_VALUE) {
			System.out.println("허용범위초과2\n");
		} else {
			byte b2 = (byte) i2;
			System.out.println(b2+"\n");
		}
//		벗어나지 않는 경우에만 캐스팅2

	}

}
