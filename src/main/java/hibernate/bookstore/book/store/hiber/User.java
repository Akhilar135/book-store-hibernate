package hibernate.bookstore.book.store.hiber;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.ArrayList;

@Entity
public class User {
	
	@Id
	private int userId;
	private String userName;
	
	

//	@ManyToMany
//	private List<Book> books = new ArrayList<Book>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
//	public List<Book> getBooks() {
//		return books;
//	}
//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}
	
	 
	 
//	@Override
//	public String toString() {
//		return "User [id=" + userId + ", name=" + userName +  "]";
//	}
	
	
	
	

}
