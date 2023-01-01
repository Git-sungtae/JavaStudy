package chap05_practice_2;

class Book{
	private String bookName;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}


public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("책1","저자1");
		library[1] = new Book("책2","저자2");
		library[2] = new Book("책3","저자3");
		library[3] = new Book("책4","저자4");
		library[4] = new Book("책5","저자5");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
	}

}
