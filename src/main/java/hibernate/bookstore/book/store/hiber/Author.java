package hibernate.bookstore.book.store.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Author {
	
	@Id
	private int authorId;
	private String authorName;
	
	@OneToOne
	private Book book;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int i) {
		this.authorId = i;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book getBook() { return book; }
	 public void setBook(Book book) { this.book = book; }
	
	
	

}
