package hibernate.bookstore.book.store.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	
	@OneToMany
	private List<User> us = new ArrayList<User>();

//	@ManyToMany
//private List<User> users = new ArrayList<User>();
	
//	
////	public List<User> getUsers() {
////		return users;
////	}
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
//	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setUs(List<User> us) {
		this.us = us;
		
	}
	public List<User> getUs() {
		return us;
	}
}
