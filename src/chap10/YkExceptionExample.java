package chap10;

//class YkException extends RuntimeException {
//	public YkException() {
//		super("영광씨가 밥상을 엎습니다.");
//	}
//	
//	public YkException(String string) {
//		super(string);
//	}
//}

class YkLunch{
	int egg;
	int riceCake;
	String s;
	
//	public YkLunch(int egg, int riceCake) {
//		this.egg = egg;
//		this.riceCake = riceCake;
//	}
	
	public static void eatNow() throws Exception{
		int a;
		System.out.println(a = 1/0);
		
		System.out.println("1111");
	}
	
	public void anotherLunch(){
		System.out.println("오늘은 영광씨가 라볶이가 먹고싶은 날입니다.");
	}
}


public class YkExceptionExample{
		public static void main(String[] args){ //JVM

		try {
			YkLunch.eatNow();
		} catch (Exception e) {
			System.out.println("예외처리");
			e.printStackTrace();
		}	
		
		System.out.println("sss");
			
			
//		YkLunch lunch = new YkLunch(3, 0);
		
//		lunch.eatNow();
		
		
//		System.out.println("==============<예외처리 작성 후>==============");
		
			
		 
//			lunch.anotherLunch();
//			System.out.println("==============<예외 메시지 출력>===============");
//			System.out.println(e.getMessage());
//			System.out.println("==============<예외 발생코드 출력 : e.printStackTrace();>===========");
//			e.printStackTrace();
		
	}

}
