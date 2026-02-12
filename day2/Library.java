package week2.day2;

public class Library {

	public String addBook(String bookTitle) {
		
		return bookTitle;

	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");

	}
	public static void main(String[] args) {
		
		Library book = new Library();
		String addBook = book.addBook("Two States");
		System.out.println(addBook);
		book.issueBook();

	}

}
