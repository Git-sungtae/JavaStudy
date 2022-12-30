package chap11_practice_1;

class Book{
	String title;
	String author;
	
	Book(String title, String author) {

		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title +"," + author; 
	}
	
	
}


public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("두잇자바", "은종님");
		//print 내부에 toString이 들어있기 때문에
		//print가 toString의 영향을 받음
		System.out.println(book);
				
		//String 내부에서 재정의가 되어있어서 내부의 문자열이 출력됨
		String str = new String ("test");
		System.out.println(str);
		
		
	}

}
