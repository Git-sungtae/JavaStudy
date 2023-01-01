package chap05_practice_2;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("제목1", "제목1");
		bookArr1[1] = new Book("제목2", "제목2");
		bookArr1[2] = new Book("제목3", "제목3");
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		System.out.println("==========================");
		
		bookArr1[0].setBookName("변경된 제목");
		bookArr1[0].setAuthor("변경된 저자");
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr1[i].showBookInfo();
		}
		System.out.println("==========================");
		//얕은복사 : 주소가 복사되는것
		//주소가 복사되기 때문에 원본배열의 요소가 변경되면 복사본도 변경됨
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		System.out.println("==========================");
		
		//깊은복사 하는 방법
		//인스턴스를 새로 만들어서 그 인스턴스에 원본배열의 요소를 넣어야 한다
		
		//원본 배열의 요소를 파라미터로 인스턴스를 만들어서 붙일배열에 입력
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr2[i]= new Book(bookArr1[i].getBookName(), bookArr1[i].getAuthor());
			bookArr2[i].showBookInfo();
		}
		//원본 배열의 요소 변경
		bookArr1[0].setBookName("변경 두번 된 제목");
		bookArr1[0].setAuthor("변경 두번 된 제목");
		
		//영향 받지 않음
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		//필요에 의해 사용하면 된다.
		//서로 영향받는 배열이 필요하다 → 얕은 복사
		//서로 영향받지 않는 배열이 필요하다 → 깊은 복사
		System.out.println("==========================");
		//향상된 for문
		String[] strArr = {"java", "Android","C"};
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for (String s : strArr) {
			System.out.println(s);
		}
		
		for (Book b : bookArr1) {
			b.showBookInfo();
		}
		
	}

}
