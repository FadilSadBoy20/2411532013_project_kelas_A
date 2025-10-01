package SMPPraktikum4;

public class Book {
	private String title;
	private String author;
	private String category;
	private String subject;
	private boolean isAvailable;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.subject = subject;
		this.isAvailable = true;
	}
	
	public String getTitle() { return title; }
	public String getAuthor() { return author; }
	public String getCategory() { return category; }
	public String getSubject() { return subject; }
	public boolean isAvailable() {return isAvailable; }
	
	public void borrowBook() { this.isAvailable = false; }
	public void returnBook() {this.isAvailable = true; }

}
